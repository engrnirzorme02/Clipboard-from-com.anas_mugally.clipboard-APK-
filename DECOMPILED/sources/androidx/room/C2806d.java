package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C2806d;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.room.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2806d {

    /* JADX INFO: renamed from: a */
    private final String f11301a;

    /* JADX INFO: renamed from: b */
    private final C2805c f11302b;

    /* JADX INFO: renamed from: c */
    private final Executor f11303c;

    /* JADX INFO: renamed from: d */
    private final Context f11304d;

    /* JADX INFO: renamed from: e */
    private int f11305e;

    /* JADX INFO: renamed from: f */
    public C2805c.c f11306f;

    /* JADX INFO: renamed from: g */
    private InterfaceC2804b f11307g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC2803a f11308h;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f11309i;

    /* JADX INFO: renamed from: j */
    private final ServiceConnection f11310j;

    /* JADX INFO: renamed from: k */
    private final Runnable f11311k;

    /* JADX INFO: renamed from: l */
    private final Runnable f11312l;

    /* JADX INFO: renamed from: androidx.room.d$a */
    public static final class a extends C2805c.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C2805c.c
        /* JADX INFO: renamed from: b */
        public boolean mo13965b() {
            return true;
        }

        @Override // androidx.room.C2805c.c
        /* JADX INFO: renamed from: c */
        public void mo13966c(Set tables) {
            AbstractC6118n.m27187e(tables, "tables");
            if (C2806d.this.m13982j().get()) {
                return;
            }
            try {
                InterfaceC2804b interfaceC2804bM13980h = C2806d.this.m13980h();
                if (interfaceC2804bM13980h != null) {
                    interfaceC2804bM13980h.mo13932z0(C2806d.this.m13975c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot broadcast invalidation", e7);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$b */
    public static final class b extends InterfaceC2803a.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: N0 */
        public static final void m13986N0(C2806d this$0, String[] tables) {
            AbstractC6118n.m27187e(this$0, "this$0");
            AbstractC6118n.m27187e(tables, "$tables");
            this$0.m13977e().m13951k((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.InterfaceC2803a
        /* JADX INFO: renamed from: p */
        public void mo13934p(final String[] tables) {
            AbstractC6118n.m27187e(tables, "tables");
            Executor executorM13976d = C2806d.this.m13976d();
            final C2806d c2806d = C2806d.this;
            executorM13976d.execute(new Runnable() { // from class: y0.o
                @Override // java.lang.Runnable
                public final void run() {
                    C2806d.b.m13986N0(c2806d, tables);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$c */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            AbstractC6118n.m27187e(name, "name");
            AbstractC6118n.m27187e(service, "service");
            C2806d.this.m13984m(InterfaceC2804b.a.m13936L0(service));
            C2806d.this.m13976d().execute(C2806d.this.m13981i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC6118n.m27187e(name, "name");
            C2806d.this.m13976d().execute(C2806d.this.m13979g());
            C2806d.this.m13984m(null);
        }
    }

    public C2806d(Context context, String name, Intent serviceIntent, C2805c invalidationTracker, Executor executor) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(serviceIntent, "serviceIntent");
        AbstractC6118n.m27187e(invalidationTracker, "invalidationTracker");
        AbstractC6118n.m27187e(executor, "executor");
        this.f11301a = name;
        this.f11302b = invalidationTracker;
        this.f11303c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f11304d = applicationContext;
        this.f11308h = new b();
        this.f11309i = new AtomicBoolean(false);
        c cVar = new c();
        this.f11310j = cVar;
        this.f11311k = new Runnable() { // from class: y0.m
            @Override // java.lang.Runnable
            public final void run() {
                C2806d.m13974n(this.f29914a);
            }
        };
        this.f11312l = new Runnable() { // from class: y0.n
            @Override // java.lang.Runnable
            public final void run() {
                C2806d.m13973k(this.f29915a);
            }
        };
        m13983l(new a((String[]) invalidationTracker.m13949i().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m13973k(C2806d this$0) {
        AbstractC6118n.m27187e(this$0, "this$0");
        this$0.f11302b.m13953n(this$0.m13978f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m13974n(C2806d this$0) {
        AbstractC6118n.m27187e(this$0, "this$0");
        try {
            InterfaceC2804b interfaceC2804b = this$0.f11307g;
            if (interfaceC2804b != null) {
                this$0.f11305e = interfaceC2804b.mo13931x(this$0.f11308h, this$0.f11301a);
                this$0.f11302b.m13943c(this$0.m13978f());
            }
        } catch (RemoteException e7) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m13975c() {
        return this.f11305e;
    }

    /* JADX INFO: renamed from: d */
    public final Executor m13976d() {
        return this.f11303c;
    }

    /* JADX INFO: renamed from: e */
    public final C2805c m13977e() {
        return this.f11302b;
    }

    /* JADX INFO: renamed from: f */
    public final C2805c.c m13978f() {
        C2805c.c cVar = this.f11306f;
        if (cVar != null) {
            return cVar;
        }
        AbstractC6118n.m27197o("observer");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Runnable m13979g() {
        return this.f11312l;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC2804b m13980h() {
        return this.f11307g;
    }

    /* JADX INFO: renamed from: i */
    public final Runnable m13981i() {
        return this.f11311k;
    }

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean m13982j() {
        return this.f11309i;
    }

    /* JADX INFO: renamed from: l */
    public final void m13983l(C2805c.c cVar) {
        AbstractC6118n.m27187e(cVar, "<set-?>");
        this.f11306f = cVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m13984m(InterfaceC2804b interfaceC2804b) {
        this.f11307g = interfaceC2804b;
    }
}
