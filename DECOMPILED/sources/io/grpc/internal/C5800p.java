package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p063H5.AbstractC0541f;
import p063H5.C0511F;
import p063H5.C0516K;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.p */
/* JADX INFO: loaded from: classes.dex */
final class C5800p {

    /* JADX INFO: renamed from: f */
    static final Logger f22814f = Logger.getLogger(AbstractC0541f.class.getName());

    /* JADX INFO: renamed from: a */
    private final Object f22815a = new Object();

    /* JADX INFO: renamed from: b */
    private final C0516K f22816b;

    /* JADX INFO: renamed from: c */
    private final Collection f22817c;

    /* JADX INFO: renamed from: d */
    private final long f22818d;

    /* JADX INFO: renamed from: e */
    private int f22819e;

    /* JADX INFO: renamed from: io.grpc.internal.p$a */
    class a extends ArrayDeque {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f22820a;

        a(int i7) {
            this.f22820a = i7;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(C0511F c0511f) {
            if (size() == this.f22820a) {
                removeFirst();
            }
            C5800p.m26102a(C5800p.this);
            return super.add(c0511f);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.p$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22822a;

        static {
            int[] iArr = new int[C0511F.b.values().length];
            f22822a = iArr;
            try {
                iArr[C0511F.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22822a[C0511F.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    C5800p(C0516K c0516k, int i7, long j7, String str) {
        AbstractC1209m.m5303o(str, "description");
        this.f22816b = (C0516K) AbstractC1209m.m5303o(c0516k, "logId");
        if (i7 > 0) {
            this.f22817c = new a(i7);
        } else {
            this.f22817c = null;
        }
        this.f22818d = j7;
        m26106e(new C0511F.a().m2147b(str + " created").m2148c(C0511F.b.CT_INFO).m2150e(j7).m2146a());
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m26102a(C5800p c5800p) {
        int i7 = c5800p.f22819e;
        c5800p.f22819e = i7 + 1;
        return i7;
    }

    /* JADX INFO: renamed from: d */
    static void m26103d(C0516K c0516k, Level level, String str) {
        Logger logger = f22814f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c0516k + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: renamed from: b */
    C0516K m26104b() {
        return this.f22816b;
    }

    /* JADX INFO: renamed from: c */
    boolean m26105c() {
        boolean z7;
        synchronized (this.f22815a) {
            z7 = this.f22817c != null;
        }
        return z7;
    }

    /* JADX INFO: renamed from: e */
    void m26106e(C0511F c0511f) {
        Level level;
        int i7 = b.f22822a[c0511f.f1915b.ordinal()];
        if (i7 != 1) {
            level = i7 != 2 ? Level.FINEST : Level.FINER;
        } else {
            level = Level.FINE;
        }
        m26107f(c0511f);
        m26103d(this.f22816b, level, c0511f.f1914a);
    }

    /* JADX INFO: renamed from: f */
    void m26107f(C0511F c0511f) {
        synchronized (this.f22815a) {
            try {
                Collection collection = this.f22817c;
                if (collection != null) {
                    collection.add(c0511f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
