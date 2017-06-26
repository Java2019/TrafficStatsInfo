package com.samples.network.trafficstatsinfo;

import android.app.Activity;
import android.net.TrafficStats;
import android.os.Bundle;
import android.widget.TextView;

public class TrafficStatsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_stats);

        final TextView text = (TextView)findViewById(R.id.text);

        text.append("Total:");
        text.append("\n\tRX Bytes:\t" + TrafficStats.getTotalRxBytes());

        text.append("\n\tRX Packets:\t" +
                TrafficStats.getTotalRxPackets());
        text.append("\n\tTX Bytes:\t" + TrafficStats.getTotalTxBytes());
        text.append("\n\tTX Packets:\t" +
                TrafficStats.getTotalTxPackets());
        text.append("\nMobile:");
        text.append("\n\tRX Bytes:\t" + TrafficStats.getMobileRxBytes());
        text.append("\n\tRX Packets:\t" +
                TrafficStats.getMobileRxPackets());
        text.append("\n\tTX Bytes:\t" + TrafficStats.getMobileTxBytes());
        text.append("\n\tTX Packets:\t" +
                TrafficStats.getMobileTxPackets());
    }
}
