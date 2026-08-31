package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import p112O0.AbstractC1097j;
import p119P0.C1182i;
import p168W0.C1805g;
import p168W0.InterfaceC1806h;
import p175X0.C1928f;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2902a {

    /* JADX INFO: renamed from: a */
    private static final String f11916a = AbstractC1097j.m4846f("Alarms");

    /* JADX INFO: renamed from: a */
    public static void m14546a(Context context, C1182i c1182i, String str) {
        InterfaceC1806h interfaceC1806hMo14515H = c1182i.m5173o().mo14515H();
        C1805g c1805gMo7521b = interfaceC1806hMo14515H.mo7521b(str);
        if (c1805gMo7521b != null) {
            m14547b(context, str, c1805gMo7521b.f5870b);
            AbstractC1097j.m4844c().mo4847a(f11916a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            interfaceC1806hMo14515H.mo7523d(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m14547b(Context context, String str, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, C2903b.m14551b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f11916a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i7)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: c */
    public static void m14548c(Context context, C1182i c1182i, String str, long j7) {
        WorkDatabase workDatabaseM5173o = c1182i.m5173o();
        InterfaceC1806h interfaceC1806hMo14515H = workDatabaseM5173o.mo14515H();
        C1805g c1805gMo7521b = interfaceC1806hMo14515H.mo7521b(str);
        if (c1805gMo7521b != null) {
            m14547b(context, str, c1805gMo7521b.f5870b);
            m14549d(context, str, c1805gMo7521b.f5870b, j7);
        } else {
            int iM7975b = new C1928f(workDatabaseM5173o).m7975b();
            interfaceC1806hMo14515H.mo7522c(new C1805g(str, iM7975b));
            m14549d(context, str, iM7975b, j7);
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m14549d(Context context, String str, int i7, long j7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, C2903b.m14551b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j7, service);
        }
    }
}
