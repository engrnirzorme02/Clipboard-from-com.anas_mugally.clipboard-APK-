package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p112O0.AbstractC1097j;
import p112O0.C1092e;
import p119P0.C1182i;
import p119P0.InterfaceC1175b;
import p140S0.C1385d;
import p140S0.InterfaceC1384c;
import p168W0.C1814p;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: androidx.work.impl.foreground.a */
/* JADX INFO: loaded from: classes.dex */
public class C2910a implements InterfaceC1384c, InterfaceC1175b {

    /* JADX INFO: renamed from: v */
    static final String f11971v = AbstractC1097j.m4846f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    private Context f11972a;

    /* JADX INFO: renamed from: b */
    private C1182i f11973b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2010a f11974c;

    /* JADX INFO: renamed from: d */
    final Object f11975d = new Object();

    /* JADX INFO: renamed from: e */
    String f11976e;

    /* JADX INFO: renamed from: f */
    final Map f11977f;

    /* JADX INFO: renamed from: r */
    final Map f11978r;

    /* JADX INFO: renamed from: s */
    final Set f11979s;

    /* JADX INFO: renamed from: t */
    final C1385d f11980t;

    /* JADX INFO: renamed from: u */
    private b f11981u;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WorkDatabase f11982a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f11983b;

        a(WorkDatabase workDatabase, String str) {
            this.f11982a = workDatabase;
            this.f11983b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1814p c1814pMo7550n = this.f11982a.mo14518K().mo7550n(this.f11983b);
            if (c1814pMo7550n == null || !c1814pMo7550n.m7533b()) {
                return;
            }
            synchronized (C2910a.this.f11975d) {
                C2910a.this.f11978r.put(this.f11983b, c1814pMo7550n);
                C2910a.this.f11979s.add(c1814pMo7550n);
                C2910a c2910a = C2910a.this;
                c2910a.f11980t.m5957d(c2910a.f11979s);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$b */
    interface b {
        /* JADX INFO: renamed from: c */
        void mo14582c(int i7, int i8, Notification notification);

        /* JADX INFO: renamed from: d */
        void mo14583d(int i7, Notification notification);

        /* JADX INFO: renamed from: e */
        void mo14584e(int i7);

        void stop();
    }

    C2910a(Context context) {
        this.f11972a = context;
        C1182i c1182iM5164k = C1182i.m5164k(context);
        this.f11973b = c1182iM5164k;
        InterfaceC2010a interfaceC2010aM5174p = c1182iM5164k.m5174p();
        this.f11974c = interfaceC2010aM5174p;
        this.f11976e = null;
        this.f11977f = new LinkedHashMap();
        this.f11979s = new HashSet();
        this.f11978r = new HashMap();
        this.f11980t = new C1385d(this.f11972a, interfaceC2010aM5174p, this);
        this.f11973b.m5171m().m5129c(this);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m14585a(Context context, String str, C1092e c1092e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c1092e.m4837c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1092e.m4835a());
        intent.putExtra("KEY_NOTIFICATION", c1092e.m4836b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m14586c(Context context, String str, C1092e c1092e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c1092e.m4837c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1092e.m4835a());
        intent.putExtra("KEY_NOTIFICATION", c1092e.m4836b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: e */
    public static Intent m14587e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* JADX INFO: renamed from: g */
    private void m14588g(Intent intent) {
        AbstractC1097j.m4844c().mo4849d(f11971v, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f11973b.m5166f(UUID.fromString(stringExtra));
    }

    /* JADX INFO: renamed from: h */
    private void m14589h(Intent intent) {
        int iM4835a = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC1097j.m4844c().mo4847a(f11971v, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f11981u == null) {
            return;
        }
        this.f11977f.put(stringExtra, new C1092e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f11976e)) {
            this.f11976e = stringExtra;
            this.f11981u.mo14582c(intExtra, intExtra2, notification);
            return;
        }
        this.f11981u.mo14583d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f11977f.entrySet().iterator();
        while (it.hasNext()) {
            iM4835a |= ((C1092e) ((Map.Entry) it.next()).getValue()).m4835a();
        }
        C1092e c1092e = (C1092e) this.f11977f.get(this.f11976e);
        if (c1092e != null) {
            this.f11981u.mo14582c(c1092e.m4837c(), iM4835a, c1092e.m4836b());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m14590i(Intent intent) {
        AbstractC1097j.m4844c().mo4849d(f11971v, String.format("Started foreground service %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f11974c.mo8371b(new a(this.f11973b.m5173o(), stringExtra));
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: b */
    public void mo5494b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1097j.m4844c().mo4847a(f11971v, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f11973b.m5180w(str);
        }
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        Map.Entry entry;
        synchronized (this.f11975d) {
            try {
                C1814p c1814p = (C1814p) this.f11978r.remove(str);
                if (c1814p != null ? this.f11979s.remove(c1814p) : false) {
                    this.f11980t.m5957d(this.f11979s);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1092e c1092e = (C1092e) this.f11977f.remove(str);
        if (str.equals(this.f11976e) && this.f11977f.size() > 0) {
            Iterator it = this.f11977f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f11976e = (String) entry.getKey();
            if (this.f11981u != null) {
                C1092e c1092e2 = (C1092e) entry.getValue();
                this.f11981u.mo14582c(c1092e2.m4837c(), c1092e2.m4835a(), c1092e2.m4836b());
                this.f11981u.mo14584e(c1092e2.m4837c());
            }
        }
        b bVar = this.f11981u;
        if (c1092e == null || bVar == null) {
            return;
        }
        AbstractC1097j.m4844c().mo4847a(f11971v, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(c1092e.m4837c()), str, Integer.valueOf(c1092e.m4835a())), new Throwable[0]);
        bVar.mo14584e(c1092e.m4837c());
    }

    @Override // p140S0.InterfaceC1384c
    /* JADX INFO: renamed from: f */
    public void mo5495f(List list) {
    }

    /* JADX INFO: renamed from: j */
    void m14591j(Intent intent) {
        AbstractC1097j.m4844c().mo4849d(f11971v, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f11981u;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: renamed from: k */
    void m14592k() {
        this.f11981u = null;
        synchronized (this.f11975d) {
            this.f11980t.m5958e();
        }
        this.f11973b.m5171m().m5133i(this);
    }

    /* JADX INFO: renamed from: l */
    void m14593l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m14590i(intent);
            m14589h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m14589h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m14588g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m14591j(intent);
        }
    }

    /* JADX INFO: renamed from: m */
    void m14594m(b bVar) {
        if (this.f11981u != null) {
            AbstractC1097j.m4844c().mo4848b(f11971v, "A callback already exists.", new Throwable[0]);
        } else {
            this.f11981u = bVar;
        }
    }
}
