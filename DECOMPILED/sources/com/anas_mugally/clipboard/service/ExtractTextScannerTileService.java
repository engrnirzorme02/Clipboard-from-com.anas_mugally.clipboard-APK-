package com.anas_mugally.clipboard.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.anas_mugally.clipboard.C3149w;
import com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class ExtractTextScannerTileService extends TileService {
    /* JADX INFO: renamed from: a */
    private final PendingIntent m15188a() {
        Intent intent = new Intent(this, (Class<?>) ScannerReceiver.class);
        intent.setAction("com.anas_mugally.clipboard.action_extract_text");
        intent.putExtra(C3149w.f13206f.m16727a(), true);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 201326592);
        AbstractC6118n.m27186d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        super.onClick();
        try {
            m15188a().send();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        super.onStartListening();
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(2);
            qsTile.updateTile();
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        super.onTileAdded();
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(2);
            qsTile.updateTile();
        }
    }
}
