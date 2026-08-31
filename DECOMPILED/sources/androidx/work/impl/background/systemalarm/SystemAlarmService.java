package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.AbstractServiceC2662x;
import p112O0.AbstractC1097j;
import p175X0.AbstractC1936n;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC2662x implements C2906e.c {

    /* JADX INFO: renamed from: d */
    private static final String f11913d = AbstractC1097j.m4846f("SystemAlarmService");

    /* JADX INFO: renamed from: b */
    private C2906e f11914b;

    /* JADX INFO: renamed from: c */
    private boolean f11915c;

    /* JADX INFO: renamed from: f */
    private void m14544f() {
        C2906e c2906e = new C2906e(this);
        this.f11914b = c2906e;
        c2906e.m14579m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.C2906e.c
    /* JADX INFO: renamed from: a */
    public void mo14545a() {
        this.f11915c = true;
        AbstractC1097j.m4844c().mo4847a(f11913d, "All commands completed in dispatcher", new Throwable[0]);
        AbstractC1936n.m7986a();
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC2662x, android.app.Service
    public void onCreate() {
        super.onCreate();
        m14544f();
        this.f11915c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC2662x, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11915c = true;
        this.f11914b.m14577j();
    }

    @Override // androidx.lifecycle.AbstractServiceC2662x, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f11915c) {
            AbstractC1097j.m4844c().mo4849d(f11913d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f11914b.m14577j();
            m14544f();
            this.f11915c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11914b.m14571a(intent, i8);
        return 3;
    }
}
