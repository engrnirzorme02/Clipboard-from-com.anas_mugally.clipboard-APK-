package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.I0 */
/* JADX INFO: loaded from: classes.dex */
class ExecutorC5739I0 implements Executor {

    /* JADX INFO: renamed from: c */
    private static final Logger f22189c = Logger.getLogger(ExecutorC5739I0.class.getName());

    /* JADX INFO: renamed from: a */
    private boolean f22190a;

    /* JADX INFO: renamed from: b */
    private ArrayDeque f22191b;

    ExecutorC5739I0() {
    }

    /* JADX INFO: renamed from: a */
    private void m25591a() {
        while (true) {
            Runnable runnable = (Runnable) this.f22191b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f22189c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m25592b(Runnable runnable) {
        if (this.f22191b == null) {
            this.f22191b = new ArrayDeque(4);
        }
        this.f22191b.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC1209m.m5303o(runnable, "'task' must not be null.");
        if (this.f22190a) {
            m25592b(runnable);
            return;
        }
        this.f22190a = true;
        try {
            runnable.run();
            if (this.f22191b != null) {
            }
        } catch (Throwable th) {
            try {
                f22189c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f22191b != null) {
                    m25591a();
                }
                this.f22190a = false;
            }
        }
    }
}
