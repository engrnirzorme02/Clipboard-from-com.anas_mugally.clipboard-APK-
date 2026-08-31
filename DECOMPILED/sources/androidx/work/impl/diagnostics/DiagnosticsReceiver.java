package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p112O0.AbstractC1097j;
import p112O0.AbstractC1107t;
import p112O0.C1099l;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f11955a = AbstractC1097j.m4846f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f11955a, "Requesting diagnostics", new Throwable[0]);
        try {
            AbstractC1107t.m4862d(context).m4865b(C1099l.m4852d(DiagnosticsWorker.class));
        } catch (IllegalStateException e7) {
            AbstractC1097j.m4844c().mo4848b(f11955a, "WorkManager is not initialized", e7);
        }
    }
}
