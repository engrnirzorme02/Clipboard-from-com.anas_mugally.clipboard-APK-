package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.e */
/* JADX INFO: loaded from: classes2.dex */
final class ServiceConnectionC4775e implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4776f f18380a;

    /* synthetic */ ServiceConnectionC4775e(C4776f c4776f, AbstractC4774d abstractC4774d) {
        this.f18380a = c4776f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f18380a.f18383b.m21893d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f18380a.m21917c().post(new C4772b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f18380a.f18383b.m21893d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f18380a.m21917c().post(new C4773c(this));
    }
}
