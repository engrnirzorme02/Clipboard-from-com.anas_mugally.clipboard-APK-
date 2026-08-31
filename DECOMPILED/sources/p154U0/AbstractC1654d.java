package p154U0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p112O0.AbstractC1097j;
import p140S0.InterfaceC1382a;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: U0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1654d {

    /* JADX INFO: renamed from: f */
    private static final String f5451f = AbstractC1097j.m4846f("ConstraintTracker");

    /* JADX INFO: renamed from: a */
    protected final InterfaceC2010a f5452a;

    /* JADX INFO: renamed from: b */
    protected final Context f5453b;

    /* JADX INFO: renamed from: c */
    private final Object f5454c = new Object();

    /* JADX INFO: renamed from: d */
    private final Set f5455d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    Object f5456e;

    /* JADX INFO: renamed from: U0.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f5457a;

        a(List list) {
            this.f5457a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5457a.iterator();
            while (it.hasNext()) {
                ((InterfaceC1382a) it.next()).mo5949a(AbstractC1654d.this.f5456e);
            }
        }
    }

    AbstractC1654d(Context context, InterfaceC2010a interfaceC2010a) {
        this.f5453b = context.getApplicationContext();
        this.f5452a = interfaceC2010a;
    }

    /* JADX INFO: renamed from: a */
    public void m6907a(InterfaceC1382a interfaceC1382a) {
        synchronized (this.f5454c) {
            try {
                if (this.f5455d.add(interfaceC1382a)) {
                    if (this.f5455d.size() == 1) {
                        this.f5456e = mo6900b();
                        AbstractC1097j.m4844c().mo4847a(f5451f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f5456e), new Throwable[0]);
                        mo6905e();
                    }
                    interfaceC1382a.mo5949a(this.f5456e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo6900b();

    /* JADX INFO: renamed from: c */
    public void m6908c(InterfaceC1382a interfaceC1382a) {
        synchronized (this.f5454c) {
            try {
                if (this.f5455d.remove(interfaceC1382a) && this.f5455d.isEmpty()) {
                    mo6906f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m6909d(Object obj) {
        synchronized (this.f5454c) {
            try {
                Object obj2 = this.f5456e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f5456e = obj;
                    this.f5452a.mo8370a().execute(new a(new ArrayList(this.f5455d)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo6905e();

    /* JADX INFO: renamed from: f */
    public abstract void mo6906f();
}
