package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C4776f {

    /* JADX INFO: renamed from: o */
    private static final Map f18381o = new HashMap();

    /* JADX INFO: renamed from: a */
    private final Context f18382a;

    /* JADX INFO: renamed from: b */
    private final C4763G f18383b;

    /* JADX INFO: renamed from: c */
    private final String f18384c;

    /* JADX INFO: renamed from: g */
    private boolean f18388g;

    /* JADX INFO: renamed from: h */
    private final Intent f18389h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC4770N f18390i;

    /* JADX INFO: renamed from: m */
    private ServiceConnection f18394m;

    /* JADX INFO: renamed from: n */
    private IInterface f18395n;

    /* JADX INFO: renamed from: d */
    private final List f18385d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final Set f18386e = new HashSet();

    /* JADX INFO: renamed from: f */
    private final Object f18387f = new Object();

    /* JADX INFO: renamed from: k */
    private final IBinder.DeathRecipient f18392k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.I
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C4776f.m21906k(this.f18368a);
        }
    };

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f18393l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    private final WeakReference f18391j = new WeakReference(null);

    public C4776f(Context context, C4763G c4763g, String str, Intent intent, InterfaceC4770N interfaceC4770N, InterfaceC4769M interfaceC4769M) {
        this.f18382a = context;
        this.f18383b = c4763g;
        this.f18384c = str;
        this.f18389h = intent;
        this.f18390i = interfaceC4770N;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m21906k(C4776f c4776f) {
        c4776f.f18383b.m21893d("reportBinderDeath", new Object[0]);
        AbstractC2263x.m9328a(c4776f.f18391j.get());
        c4776f.f18383b.m21893d("%s : Binder has died.", c4776f.f18384c);
        Iterator it = c4776f.f18385d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC4764H) it.next()).mo21833a(c4776f.m21915w());
        }
        c4776f.f18385d.clear();
        synchronized (c4776f.f18387f) {
            c4776f.m21916x();
        }
    }

    /* JADX INFO: renamed from: o */
    static /* bridge */ /* synthetic */ void m21910o(final C4776f c4776f, final TaskCompletionSource taskCompletionSource) {
        c4776f.f18386e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.J
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f18369a.m21920u(taskCompletionSource, task);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    static /* bridge */ /* synthetic */ void m21912q(C4776f c4776f, AbstractRunnableC4764H abstractRunnableC4764H) {
        if (c4776f.f18395n != null || c4776f.f18388g) {
            if (!c4776f.f18388g) {
                abstractRunnableC4764H.run();
                return;
            } else {
                c4776f.f18383b.m21893d("Waiting to bind to the service.", new Object[0]);
                c4776f.f18385d.add(abstractRunnableC4764H);
                return;
            }
        }
        c4776f.f18383b.m21893d("Initiate binding to the service.", new Object[0]);
        c4776f.f18385d.add(abstractRunnableC4764H);
        ServiceConnectionC4775e serviceConnectionC4775e = new ServiceConnectionC4775e(c4776f, null);
        c4776f.f18394m = serviceConnectionC4775e;
        c4776f.f18388g = true;
        if (c4776f.f18382a.bindService(c4776f.f18389h, serviceConnectionC4775e, 1)) {
            return;
        }
        c4776f.f18383b.m21893d("Failed to bind to the service.", new Object[0]);
        c4776f.f18388g = false;
        Iterator it = c4776f.f18385d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC4764H) it.next()).mo21833a(new C4777g());
        }
        c4776f.f18385d.clear();
    }

    /* JADX INFO: renamed from: r */
    static /* bridge */ /* synthetic */ void m21913r(C4776f c4776f) {
        c4776f.f18383b.m21893d("linkToDeath", new Object[0]);
        try {
            c4776f.f18395n.asBinder().linkToDeath(c4776f.f18392k, 0);
        } catch (RemoteException e7) {
            c4776f.f18383b.m21892c(e7, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: s */
    static /* bridge */ /* synthetic */ void m21914s(C4776f c4776f) {
        c4776f.f18383b.m21893d("unlinkToDeath", new Object[0]);
        c4776f.f18395n.asBinder().unlinkToDeath(c4776f.f18392k, 0);
    }

    /* JADX INFO: renamed from: w */
    private final RemoteException m21915w() {
        return new RemoteException(String.valueOf(this.f18384c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m21916x() {
        Iterator it = this.f18386e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m21915w());
        }
        this.f18386e.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Handler m21917c() {
        Handler handler;
        Map map = f18381o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f18384c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f18384c, 10);
                    handlerThread.start();
                    map.put(this.f18384c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f18384c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m21918e() {
        return this.f18395n;
    }

    /* JADX INFO: renamed from: t */
    public final void m21919t(AbstractRunnableC4764H abstractRunnableC4764H, TaskCompletionSource taskCompletionSource) {
        m21917c().post(new C4767K(this, abstractRunnableC4764H.m21895c(), taskCompletionSource, abstractRunnableC4764H));
    }

    /* JADX INFO: renamed from: u */
    final /* synthetic */ void m21920u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f18387f) {
            this.f18386e.remove(taskCompletionSource);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m21921v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f18387f) {
            this.f18386e.remove(taskCompletionSource);
        }
        m21917c().post(new C4768L(this));
    }
}
