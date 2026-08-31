package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2662x extends Service implements InterfaceC2657s {

    /* JADX INFO: renamed from: a */
    private final C2628U f10500a = new C2628U(this);

    @Override // androidx.lifecycle.InterfaceC2657s
    /* JADX INFO: renamed from: P */
    public AbstractC2650l mo419P() {
        return this.f10500a.m12578a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        this.f10500a.m12579b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f10500a.m12580c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f10500a.m12581d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i7) {
        this.f10500a.m12582e();
        super.onStart(intent, i7);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, i7, i8);
    }
}
