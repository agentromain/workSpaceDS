import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.Second;

public class GraficaTemperatura implements Observador{
	private String title;
	private float yMin;
	private float yMax;
	private int muestras;

	private ChartPanel panel;

	private float temperaturaActual;
	private ArrayList<Integer> t;
	private DynamicTimeSeriesCollection dataset;

	public GraficaTemperatura() {
		// TODO Auto-generated constructor stub
		title = "Temperaturas (Cº)";

		yMin = -20; yMax = 60;
		muestras = 20;
		t = getTiempo();

		float[] a = new float[muestras];
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}

		dataset = new DynamicTimeSeriesCollection(1, muestras, new Second());
		dataset.setTimeBase(new Second(t.get(0), t.get(1), t.get(2), t.get(3), t.get(4), t.get(5)));
		dataset.addSeries(a, 0, "°C");

		JFreeChart graf = ChartFactory.createTimeSeriesChart( title, t.get(3)+"/"+t.get(4)+"/"+t.get(5),
				"Temperaturas", dataset, true, true, false);
		XYPlot plot = graf.getXYPlot();

		ValueAxis domain = plot.getDomainAxis();
		domain.setAutoRange(true);

		ValueAxis range = plot.getRangeAxis();
		range.setRange(yMin, yMax);

		panel = new ChartPanel(graf);
		panel.setBounds(5, 5, 800, 430);
	}

	@Override
	public void manejarEvento(int tempAct) {
		// TODO Auto-generated method stub
		temperaturaActual = tempAct;
		float[] newData = new float[1];
		newData[0] = temperaturaActual;
		dataset.advanceTime();
		dataset.appendData(newData);
	}

	public ChartPanel getPanelChart(){
		return panel;
	}

	private ArrayList<Integer> getTiempo(){
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid"), new Locale("es","es"));

		ArrayList<Integer> t = new ArrayList<>();
		t.add(cal.get(Calendar.SECOND)); t.add(cal.get(Calendar.MINUTE));
		t.add(cal.get(Calendar.HOUR_OF_DAY)); t.add(cal.get(Calendar.DAY_OF_MONTH)); 
		t.add(cal.get(Calendar.MONTH)); t.add(cal.get(Calendar.YEAR));
		return t;
	}
}
