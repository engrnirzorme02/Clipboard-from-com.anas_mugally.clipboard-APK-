package okhttp3.internal.concurrent;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task {

    /* JADX INFO: renamed from: a */
    private final String f25592a;

    /* JADX INFO: renamed from: b */
    private final boolean f25593b;

    /* JADX INFO: renamed from: c */
    private TaskQueue f25594c;

    /* JADX INFO: renamed from: d */
    private long f25595d;

    public Task(String name, boolean z7) {
        AbstractC6118n.m27187e(name, "name");
        this.f25592a = name;
        this.f25593b = z7;
        this.f25595d = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28884a() {
        return this.f25593b;
    }

    /* JADX INFO: renamed from: b */
    public final String m28885b() {
        return this.f25592a;
    }

    /* JADX INFO: renamed from: c */
    public final long m28886c() {
        return this.f25595d;
    }

    /* JADX INFO: renamed from: d */
    public final TaskQueue m28887d() {
        return this.f25594c;
    }

    /* JADX INFO: renamed from: e */
    public final void m28888e(TaskQueue queue) {
        AbstractC6118n.m27187e(queue, "queue");
        TaskQueue taskQueue = this.f25594c;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f25594c = queue;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo28863f();

    /* JADX INFO: renamed from: g */
    public final void m28889g(long j7) {
        this.f25595d = j7;
    }

    public String toString() {
        return this.f25592a;
    }

    public /* synthetic */ Task(String str, boolean z7, int i7, AbstractC6112h abstractC6112h) {
        this(str, (i7 & 2) != 0 ? true : z7);
    }
}
