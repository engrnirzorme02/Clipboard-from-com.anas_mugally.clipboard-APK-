package com.anas_mugally.clipboard.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.anas_mugally.clipboard.p221ui.addText.AddNoteActivity;

/* JADX INFO: loaded from: classes.dex */
public final class AddTextTileService extends TileService {
    @Override // android.service.quicksettings.TileService
    public void onClick() {
        super.onClick();
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                startActivityAndCollapse(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) AddNoteActivity.class).addFlags(268468224), 335544320));
                return;
            }
            Intent intent = new Intent(this, (Class<?>) AddNoteActivity.class);
            intent.addFlags(268468224);
            startActivityAndCollapse(intent);
        } catch (Exception unused) {
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
