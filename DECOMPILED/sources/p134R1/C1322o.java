package p134R1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.collection.C2390a;
import androidx.fragment.app.AbstractActivityC2592j;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.bumptech.glide.ComponentCallbacks2C3212l;
import p091L1.C0796P;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.o */
/* JADX INFO: loaded from: classes.dex */
public class C1322o implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    private static final b f4614f = new a();

    /* JADX INFO: renamed from: a */
    private volatile ComponentCallbacks2C3212l f4615a;

    /* JADX INFO: renamed from: b */
    private final b f4616b;

    /* JADX INFO: renamed from: c */
    private final C2390a f4617c = new C2390a();

    /* JADX INFO: renamed from: d */
    private final InterfaceC1316i f4618d;

    /* JADX INFO: renamed from: e */
    private final C1320m f4619e;

    /* JADX INFO: renamed from: R1.o$a */
    class a implements b {
        a() {
        }

        @Override // p134R1.C1322o.b
        /* JADX INFO: renamed from: a */
        public ComponentCallbacks2C3212l mo5669a(ComponentCallbacks2C3202b componentCallbacks2C3202b, InterfaceC1317j interfaceC1317j, InterfaceC1323p interfaceC1323p, Context context) {
            return new ComponentCallbacks2C3212l(componentCallbacks2C3202b, interfaceC1317j, interfaceC1323p, context);
        }
    }

    /* JADX INFO: renamed from: R1.o$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        ComponentCallbacks2C3212l mo5669a(ComponentCallbacks2C3202b componentCallbacks2C3202b, InterfaceC1317j interfaceC1317j, InterfaceC1323p interfaceC1323p, Context context);
    }

    public C1322o(b bVar) {
        bVar = bVar == null ? f4614f : bVar;
        this.f4616b = bVar;
        this.f4619e = new C1320m(bVar);
        this.f4618d = m5663b();
    }

    /* JADX INFO: renamed from: a */
    private static void m5662a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1316i m5663b() {
        return (C0796P.f3194f && C0796P.f3193e) ? new C1315h() : new C1313f();
    }

    /* JADX INFO: renamed from: c */
    private static Activity m5664c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5664c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private ComponentCallbacks2C3212l m5665f(Context context) {
        if (this.f4615a == null) {
            synchronized (this) {
                try {
                    if (this.f4615a == null) {
                        this.f4615a = this.f4616b.mo5669a(ComponentCallbacks2C3202b.m16988c(context.getApplicationContext()), new C1308a(), new C1314g(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4615a;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m5666g(Context context) {
        Activity activityM5664c = m5664c(context);
        return activityM5664c == null || !activityM5664c.isFinishing();
    }

    /* JADX INFO: renamed from: d */
    public ComponentCallbacks2C3212l m5667d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC2023l.m8427r() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC2592j) {
                return m5668e((AbstractActivityC2592j) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m5667d(contextWrapper.getBaseContext());
                }
            }
        }
        return m5665f(context);
    }

    /* JADX INFO: renamed from: e */
    public ComponentCallbacks2C3212l m5668e(AbstractActivityC2592j abstractActivityC2592j) {
        if (AbstractC2023l.m8426q()) {
            return m5667d(abstractActivityC2592j.getApplicationContext());
        }
        m5662a(abstractActivityC2592j);
        this.f4618d.mo5656a(abstractActivityC2592j);
        boolean zM5666g = m5666g(abstractActivityC2592j);
        return this.f4619e.m5660b(abstractActivityC2592j, ComponentCallbacks2C3202b.m16988c(abstractActivityC2592j.getApplicationContext()), abstractActivityC2592j.mo419P(), abstractActivityC2592j.m12232H0(), zM5666g);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
