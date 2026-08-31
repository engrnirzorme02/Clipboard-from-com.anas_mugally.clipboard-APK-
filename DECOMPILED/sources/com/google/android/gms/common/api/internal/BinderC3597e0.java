package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.C3675T;
import com.google.android.gms.common.internal.C3690e;
import java.util.Set;
import p170W2.C1837b;
import p299m3.AbstractC6337d;
import p299m3.InterfaceC6338e;
import p307n3.AbstractBinderC6486d;
import p307n3.C6494l;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3597e0 extends AbstractBinderC6486d implements AbstractC3560h.b, AbstractC3560h.c {

    /* JADX INFO: renamed from: s */
    private static final C3553a.a f14631s = AbstractC6337d.f24178c;

    /* JADX INFO: renamed from: a */
    private final Context f14632a;

    /* JADX INFO: renamed from: b */
    private final Handler f14633b;

    /* JADX INFO: renamed from: c */
    private final C3553a.a f14634c;

    /* JADX INFO: renamed from: d */
    private final Set f14635d;

    /* JADX INFO: renamed from: e */
    private final C3690e f14636e;

    /* JADX INFO: renamed from: f */
    private InterfaceC6338e f14637f;

    /* JADX INFO: renamed from: r */
    private InterfaceC3595d0 f14638r;

    public BinderC3597e0(Context context, Handler handler, C3690e c3690e) {
        C3553a.a aVar = f14631s;
        this.f14632a = context;
        this.f14633b = handler;
        this.f14636e = (C3690e) AbstractC3718s.m18084m(c3690e, "ClientSettings must not be null");
        this.f14635d = c3690e.m18011h();
        this.f14634c = aVar;
    }

    /* JADX INFO: renamed from: M0 */
    static /* bridge */ /* synthetic */ void m17865M0(BinderC3597e0 binderC3597e0, C6494l c6494l) {
        C1837b c1837bM27653T = c6494l.m27653T();
        if (c1837bM27653T.m7600X()) {
            C3675T c3675t = (C3675T) AbstractC3718s.m18083l(c6494l.m27654U());
            C1837b c1837bM17988T = c3675t.m17988T();
            if (!c1837bM17988T.m7600X()) {
                String strValueOf = String.valueOf(c1837bM17988T);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                binderC3597e0.f14638r.mo17844b(c1837bM17988T);
                binderC3597e0.f14637f.disconnect();
                return;
            }
            binderC3597e0.f14638r.mo17845c(c3675t.m17989U(), binderC3597e0.f14635d);
        } else {
            binderC3597e0.f14638r.mo17844b(c1837bM27653T);
        }
        binderC3597e0.f14637f.disconnect();
    }

    @Override // p307n3.InterfaceC6488f
    /* JADX INFO: renamed from: J0 */
    public final void mo17866J0(C6494l c6494l) {
        this.f14633b.post(new RunnableC3593c0(this, c6494l));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, m3.e] */
    /* JADX INFO: renamed from: N0 */
    public final void m17867N0(InterfaceC3595d0 interfaceC3595d0) {
        InterfaceC6338e interfaceC6338e = this.f14637f;
        if (interfaceC6338e != null) {
            interfaceC6338e.disconnect();
        }
        this.f14636e.m18015l(Integer.valueOf(System.identityHashCode(this)));
        C3553a.a aVar = this.f14634c;
        Context context = this.f14632a;
        Handler handler = this.f14633b;
        C3690e c3690e = this.f14636e;
        this.f14637f = aVar.buildClient(context, handler.getLooper(), c3690e, (Object) c3690e.m18012i(), (AbstractC3560h.b) this, (AbstractC3560h.c) this);
        this.f14638r = interfaceC3595d0;
        Set set = this.f14635d;
        if (set == null || set.isEmpty()) {
            this.f14633b.post(new RunnableC3591b0(this));
        } else {
            this.f14637f.mo27295b();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m17868O0() {
        InterfaceC6338e interfaceC6338e = this.f14637f;
        if (interfaceC6338e != null) {
            interfaceC6338e.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3598f
    public final void onConnected(Bundle bundle) {
        this.f14637f.mo27294a(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3616o
    public final void onConnectionFailed(C1837b c1837b) {
        this.f14638r.mo17844b(c1837b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3598f
    public final void onConnectionSuspended(int i7) {
        this.f14638r.mo17846d(i7);
    }
}
