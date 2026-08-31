package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Map;
import p112O0.AbstractC1097j;
import p119P0.InterfaceC1175b;
import p168W0.C1814p;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.b */
/* JADX INFO: loaded from: classes.dex */
public class C2903b implements InterfaceC1175b {

    /* JADX INFO: renamed from: d */
    private static final String f11917d = AbstractC1097j.m4846f("CommandHandler");

    /* JADX INFO: renamed from: a */
    private final Context f11918a;

    /* JADX INFO: renamed from: b */
    private final Map f11919b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Object f11920c = new Object();

    C2903b(Context context) {
        this.f11918a = context;
    }

    /* JADX INFO: renamed from: a */
    static Intent m14550a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    static Intent m14551b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    static Intent m14552c(Context context, String str, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z7);
        return intent;
    }

    /* JADX INFO: renamed from: e */
    static Intent m14553e(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: f */
    static Intent m14554f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: g */
    private void m14555g(Intent intent, int i7, C2906e c2906e) {
        AbstractC1097j.m4844c().mo4847a(f11917d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new C2904c(this.f11918a, i7, c2906e).m14564a();
    }

    /* JADX INFO: renamed from: h */
    private void m14556h(Intent intent, int i7, C2906e c2906e) {
        Bundle extras = intent.getExtras();
        synchronized (this.f11920c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
                String str = f11917d;
                abstractC1097jM4844c.mo4847a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f11919b.containsKey(string)) {
                    AbstractC1097j.m4844c().mo4847a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    C2905d c2905d = new C2905d(this.f11918a, i7, string, c2906e);
                    this.f11919b.put(string, c2905d);
                    c2905d.m14567e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m14557i(Intent intent, int i7) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z7 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC1097j.m4844c().mo4847a(f11917d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
        mo5123d(string, z7);
    }

    /* JADX INFO: renamed from: j */
    private void m14558j(Intent intent, int i7, C2906e c2906e) {
        AbstractC1097j.m4844c().mo4847a(f11917d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
        c2906e.m14575g().m5176s();
    }

    /* JADX INFO: renamed from: k */
    private void m14559k(Intent intent, int i7, C2906e c2906e) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
        String str = f11917d;
        abstractC1097jM4844c.mo4847a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseM5173o = c2906e.m14575g().m5173o();
        workDatabaseM5173o.m33029e();
        try {
            C1814p c1814pMo7550n = workDatabaseM5173o.mo14518K().mo7550n(string);
            if (c1814pMo7550n == null) {
                AbstractC1097j.m4844c().mo4851h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (c1814pMo7550n.f5893b.m4861c()) {
                AbstractC1097j.m4844c().mo4851h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jM7532a = c1814pMo7550n.m7532a();
            if (c1814pMo7550n.m7533b()) {
                AbstractC1097j.m4844c().mo4847a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jM7532a)), new Throwable[0]);
                AbstractC2902a.m14548c(this.f11918a, c2906e.m14575g(), string, jM7532a);
                c2906e.m14578k(new C2906e.b(c2906e, m14550a(this.f11918a), i7));
            } else {
                AbstractC1097j.m4844c().mo4847a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jM7532a)), new Throwable[0]);
                AbstractC2902a.m14548c(this.f11918a, c2906e.m14575g(), string, jM7532a);
            }
            workDatabaseM5173o.m33042z();
        } finally {
            workDatabaseM5173o.m33031i();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m14560l(Intent intent, C2906e c2906e) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC1097j.m4844c().mo4847a(f11917d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        c2906e.m14575g().m5181x(string);
        AbstractC2902a.m14546a(this.f11918a, c2906e.m14575g(), string);
        c2906e.mo5123d(string, false);
    }

    /* JADX INFO: renamed from: m */
    private static boolean m14561m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        synchronized (this.f11920c) {
            try {
                InterfaceC1175b interfaceC1175b = (InterfaceC1175b) this.f11919b.remove(str);
                if (interfaceC1175b != null) {
                    interfaceC1175b.mo5123d(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    boolean m14562n() {
        boolean z7;
        synchronized (this.f11920c) {
            z7 = !this.f11919b.isEmpty();
        }
        return z7;
    }

    /* JADX INFO: renamed from: o */
    void m14563o(Intent intent, int i7, C2906e c2906e) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m14555g(intent, i7, c2906e);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m14558j(intent, i7, c2906e);
            return;
        }
        if (!m14561m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC1097j.m4844c().mo4848b(f11917d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m14559k(intent, i7, c2906e);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m14556h(intent, i7, c2906e);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m14560l(intent, c2906e);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m14557i(intent, i7);
        } else {
            AbstractC1097j.m4844c().mo4851h(f11917d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
