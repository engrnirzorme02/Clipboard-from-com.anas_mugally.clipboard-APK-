package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.C2913c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p112O0.AbstractC1109v;
import p112O0.C1092e;
import p157U3.InterfaceFutureC1673e;
import p182Y0.InterfaceC2010a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: a */
    private Context f11836a;

    /* JADX INFO: renamed from: b */
    private WorkerParameters f11837b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f11838c;

    /* JADX INFO: renamed from: d */
    private boolean f11839d;

    /* JADX INFO: renamed from: e */
    private boolean f11840e;

    /* JADX INFO: renamed from: androidx.work.ListenableWorker$a */
    public static abstract class AbstractC2892a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a */
        public static final class a extends AbstractC2892a {

            /* JADX INFO: renamed from: a */
            private final C2896b f11841a;

            public a() {
                this(C2896b.f11884c);
            }

            /* JADX INFO: renamed from: e */
            public C2896b m14465e() {
                return this.f11841a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f11841a.equals(((a) obj).f11841a);
            }

            public int hashCode() {
                return (a.class.getName().hashCode() * 31) + this.f11841a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f11841a + '}';
            }

            public a(C2896b c2896b) {
                this.f11841a = c2896b;
            }
        }

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$b */
        public static final class b extends AbstractC2892a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$c */
        public static final class c extends AbstractC2892a {

            /* JADX INFO: renamed from: a */
            private final C2896b f11842a;

            public c() {
                this(C2896b.f11884c);
            }

            /* JADX INFO: renamed from: e */
            public C2896b m14466e() {
                return this.f11842a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f11842a.equals(((c) obj).f11842a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f11842a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f11842a + '}';
            }

            public c(C2896b c2896b) {
                this.f11842a = c2896b;
            }
        }

        AbstractC2892a() {
        }

        /* JADX INFO: renamed from: a */
        public static AbstractC2892a m14461a() {
            return new a();
        }

        /* JADX INFO: renamed from: b */
        public static AbstractC2892a m14462b() {
            return new b();
        }

        /* JADX INFO: renamed from: c */
        public static AbstractC2892a m14463c() {
            return new c();
        }

        /* JADX INFO: renamed from: d */
        public static AbstractC2892a m14464d(C2896b c2896b) {
            return new c(c2896b);
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f11836a = context;
        this.f11837b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f11836a;
    }

    public Executor getBackgroundExecutor() {
        return this.f11837b.m14468a();
    }

    public InterfaceFutureC1673e getForegroundInfoAsync() {
        C2913c c2913cM14629s = C2913c.m14629s();
        c2913cM14629s.mo14620p(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c2913cM14629s;
    }

    public final UUID getId() {
        return this.f11837b.m14470c();
    }

    public final C2896b getInputData() {
        return this.f11837b.m14471d();
    }

    public final Network getNetwork() {
        return this.f11837b.m14472e();
    }

    public final int getRunAttemptCount() {
        return this.f11837b.m14474g();
    }

    public final Set<String> getTags() {
        return this.f11837b.m14475h();
    }

    public InterfaceC2010a getTaskExecutor() {
        return this.f11837b.m14476i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f11837b.m14477j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f11837b.m14478k();
    }

    public AbstractC1109v getWorkerFactory() {
        return this.f11837b.m14479l();
    }

    public boolean isRunInForeground() {
        return this.f11840e;
    }

    public final boolean isStopped() {
        return this.f11838c;
    }

    public final boolean isUsed() {
        return this.f11839d;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC1673e setForegroundAsync(C1092e c1092e) {
        this.f11840e = true;
        return this.f11837b.m14469b().mo4838a(getApplicationContext(), getId(), c1092e);
    }

    public InterfaceFutureC1673e setProgressAsync(C2896b c2896b) {
        return this.f11837b.m14473f().mo4858a(getApplicationContext(), getId(), c2896b);
    }

    public void setRunInForeground(boolean z7) {
        this.f11840e = z7;
    }

    public final void setUsed() {
        this.f11839d = true;
    }

    public abstract InterfaceFutureC1673e startWork();

    public final void stop() {
        this.f11838c = true;
        onStopped();
    }
}
