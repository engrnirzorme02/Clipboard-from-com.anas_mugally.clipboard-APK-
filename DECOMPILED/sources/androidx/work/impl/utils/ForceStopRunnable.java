package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C2895a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p081K.C0709a;
import p112O0.AbstractC1097j;
import p112O0.EnumC1106s;
import p119P0.AbstractC1179f;
import p119P0.AbstractC1181h;
import p119P0.C1182i;
import p133R0.C1306e;
import p168W0.C1814p;
import p168W0.InterfaceC1812n;
import p168W0.InterfaceC1815q;
import p175X0.AbstractC1926d;
import p175X0.AbstractC1932j;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: d */
    private static final String f11985d = AbstractC1097j.m4846f("ForceStopRunnable");

    /* JADX INFO: renamed from: e */
    private static final long f11986e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a */
    private final Context f11987a;

    /* JADX INFO: renamed from: b */
    private final C1182i f11988b;

    /* JADX INFO: renamed from: c */
    private int f11989c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private static final String f11990a = AbstractC1097j.m4846f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC1097j.m4844c().mo4850g(f11990a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m14597g(context);
        }
    }

    public ForceStopRunnable(Context context, C1182i c1182i) {
        this.f11987a = context.getApplicationContext();
        this.f11988b = c1182i;
    }

    /* JADX INFO: renamed from: c */
    static Intent m14595c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: renamed from: d */
    private static PendingIntent m14596d(Context context, int i7) {
        return PendingIntent.getBroadcast(context, -1, m14595c(context), i7);
    }

    /* JADX INFO: renamed from: g */
    static void m14597g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentM14596d = m14596d(context, C0709a.m3452c() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f11986e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM14596d);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m14598a() {
        boolean zM5645i = C1306e.m5645i(this.f11987a, this.f11988b);
        WorkDatabase workDatabaseM5173o = this.f11988b.m5173o();
        InterfaceC1815q interfaceC1815qMo14518K = workDatabaseM5173o.mo14518K();
        InterfaceC1812n interfaceC1812nMo14517J = workDatabaseM5173o.mo14517J();
        workDatabaseM5173o.m33029e();
        try {
            List<C1814p> listMo7545i = interfaceC1815qMo14518K.mo7545i();
            boolean z7 = (listMo7545i == null || listMo7545i.isEmpty()) ? false : true;
            if (z7) {
                for (C1814p c1814p : listMo7545i) {
                    interfaceC1815qMo14518K.mo7546j(EnumC1106s.ENQUEUED, c1814p.f5892a);
                    interfaceC1815qMo14518K.mo7538b(c1814p.f5892a, -1L);
                }
            }
            interfaceC1812nMo14517J.mo7529b();
            workDatabaseM5173o.m33042z();
            workDatabaseM5173o.m33031i();
            return z7 || zM5645i;
        } catch (Throwable th) {
            workDatabaseM5173o.m33031i();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14599b() {
        boolean zM14598a = m14598a();
        if (m14602h()) {
            AbstractC1097j.m4844c().mo4847a(f11985d, "Rescheduling Workers.", new Throwable[0]);
            this.f11988b.m5176s();
            this.f11988b.m5170l().m7980c(false);
        } else if (m14600e()) {
            AbstractC1097j.m4844c().mo4847a(f11985d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f11988b.m5176s();
        } else if (zM14598a) {
            AbstractC1097j.m4844c().mo4847a(f11985d, "Found unfinished work, scheduling it.", new Throwable[0]);
            AbstractC1179f.m5143b(this.f11988b.m5169i(), this.f11988b.m5173o(), this.f11988b.m5172n());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m14600e() {
        try {
            PendingIntent pendingIntentM14596d = m14596d(this.f11987a, C0709a.m3452c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentM14596d != null) {
                    pendingIntentM14596d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f11987a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                        if (AbstractC1926d.m7970a(historicalProcessExitReasons.get(i7)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentM14596d == null) {
                m14597g(this.f11987a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e7) {
            e = e7;
            AbstractC1097j.m4844c().mo4851h(f11985d, "Ignoring exception", e);
            return true;
        } catch (SecurityException e8) {
            e = e8;
            AbstractC1097j.m4844c().mo4851h(f11985d, "Ignoring exception", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m14601f() {
        C2895a c2895aM5169i = this.f11988b.m5169i();
        if (TextUtils.isEmpty(c2895aM5169i.m14482c())) {
            AbstractC1097j.m4844c().mo4847a(f11985d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zM7983b = AbstractC1932j.m7983b(this.f11987a, c2895aM5169i);
        AbstractC1097j.m4844c().mo4847a(f11985d, String.format("Is default app process = %s", Boolean.valueOf(zM7983b)), new Throwable[0]);
        return zM7983b;
    }

    /* JADX INFO: renamed from: h */
    boolean m14602h() {
        return this.f11988b.m5170l().m7979a();
    }

    /* JADX INFO: renamed from: i */
    public void m14603i(long j7) {
        try {
            Thread.sleep(j7);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i7;
        try {
            if (!m14601f()) {
                this.f11988b.m5175r();
                return;
            }
            while (true) {
                AbstractC1181h.m5160e(this.f11987a);
                AbstractC1097j.m4844c().mo4847a(f11985d, "Performing cleanup operations.", new Throwable[0]);
                try {
                    m14599b();
                    this.f11988b.m5175r();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e7) {
                    i7 = this.f11989c + 1;
                    this.f11989c = i7;
                    if (i7 >= 3) {
                        AbstractC1097j.m4844c().mo4848b(f11985d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e7);
                        this.f11988b.m5169i().m14483d();
                        throw illegalStateException;
                    }
                    AbstractC1097j.m4844c().mo4847a(f11985d, String.format("Retrying after %s", Long.valueOf(((long) i7) * 300)), e7);
                    m14603i(((long) this.f11989c) * 300);
                }
                AbstractC1097j.m4844c().mo4847a(f11985d, String.format("Retrying after %s", Long.valueOf(((long) i7) * 300)), e7);
                m14603i(((long) this.f11989c) * 300);
            }
        } catch (Throwable th) {
            this.f11988b.m5175r();
            throw th;
        }
    }
}
