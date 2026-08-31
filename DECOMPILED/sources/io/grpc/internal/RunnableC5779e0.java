package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1217u;

/* JADX INFO: renamed from: io.grpc.internal.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5779e0 implements Runnable {

    /* JADX INFO: renamed from: b */
    private static final Logger f22471b = Logger.getLogger(RunnableC5779e0.class.getName());

    /* JADX INFO: renamed from: a */
    private final Runnable f22472a;

    public RunnableC5779e0(Runnable runnable) {
        this.f22472a = (Runnable) AbstractC1209m.m5303o(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f22472a.run();
        } catch (Throwable th) {
            f22471b.log(Level.SEVERE, "Exception while executing runnable " + this.f22472a, th);
            AbstractC1217u.m5334f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f22472a + ")";
    }
}
