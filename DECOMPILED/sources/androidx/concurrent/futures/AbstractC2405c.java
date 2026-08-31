package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: renamed from: androidx.concurrent.futures.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2405c {

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        Object f8509a;

        /* JADX INFO: renamed from: b */
        d f8510b;

        /* JADX INFO: renamed from: c */
        private C2406d f8511c = C2406d.m10350B();

        /* JADX INFO: renamed from: d */
        private boolean f8512d;

        a() {
        }

        /* JADX INFO: renamed from: e */
        private void m10341e() {
            this.f8509a = null;
            this.f8510b = null;
            this.f8511c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m10342a(Runnable runnable, Executor executor) {
            C2406d c2406d = this.f8511c;
            if (c2406d != null) {
                c2406d.addListener(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: b */
        void m10343b() {
            this.f8509a = null;
            this.f8510b = null;
            this.f8511c.mo10330x(null);
        }

        /* JADX INFO: renamed from: c */
        public boolean m10344c(Object obj) {
            this.f8512d = true;
            d dVar = this.f8510b;
            boolean z7 = dVar != null && dVar.m10348b(obj);
            if (z7) {
                m10341e();
            }
            return z7;
        }

        /* JADX INFO: renamed from: d */
        public boolean m10345d() {
            this.f8512d = true;
            d dVar = this.f8510b;
            boolean z7 = dVar != null && dVar.m10347a(true);
            if (z7) {
                m10341e();
            }
            return z7;
        }

        /* JADX INFO: renamed from: f */
        public boolean m10346f(Throwable th) {
            this.f8512d = true;
            d dVar = this.f8510b;
            boolean z7 = dVar != null && dVar.m10349c(th);
            if (z7) {
                m10341e();
            }
            return z7;
        }

        protected void finalize() {
            C2406d c2406d;
            d dVar = this.f8510b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m10349c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8509a));
            }
            if (this.f8512d || (c2406d = this.f8511c) == null) {
                return;
            }
            c2406d.mo10330x(null);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$b */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c */
    public interface c {
        Object attachCompleter(a aVar);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$d */
    private static final class d implements InterfaceFutureC1673e {

        /* JADX INFO: renamed from: a */
        final WeakReference f8513a;

        /* JADX INFO: renamed from: b */
        private final AbstractC2403a f8514b = new a();

        /* JADX INFO: renamed from: androidx.concurrent.futures.c$d$a */
        class a extends AbstractC2403a {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractC2403a
            /* JADX INFO: renamed from: t */
            protected String mo10329t() {
                a aVar = (a) d.this.f8513a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f8509a + "]";
            }
        }

        d(a aVar) {
            this.f8513a = new WeakReference(aVar);
        }

        /* JADX INFO: renamed from: a */
        boolean m10347a(boolean z7) {
            return this.f8514b.cancel(z7);
        }

        @Override // p157U3.InterfaceFutureC1673e
        public void addListener(Runnable runnable, Executor executor) {
            this.f8514b.addListener(runnable, executor);
        }

        /* JADX INFO: renamed from: b */
        boolean m10348b(Object obj) {
            return this.f8514b.mo10330x(obj);
        }

        /* JADX INFO: renamed from: c */
        boolean m10349c(Throwable th) {
            return this.f8514b.mo10331y(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z7) {
            a aVar = (a) this.f8513a.get();
            boolean zCancel = this.f8514b.cancel(z7);
            if (zCancel && aVar != null) {
                aVar.m10343b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f8514b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f8514b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f8514b.isDone();
        }

        public String toString() {
            return this.f8514b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j7, TimeUnit timeUnit) {
            return this.f8514b.get(j7, timeUnit);
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC1673e m10340a(c cVar) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f8510b = dVar;
        aVar.f8509a = cVar.getClass();
        try {
            Object objAttachCompleter = cVar.attachCompleter(aVar);
            if (objAttachCompleter != null) {
                aVar.f8509a = objAttachCompleter;
                return dVar;
            }
        } catch (Exception e7) {
            dVar.m10349c(e7);
        }
        return dVar;
    }
}
