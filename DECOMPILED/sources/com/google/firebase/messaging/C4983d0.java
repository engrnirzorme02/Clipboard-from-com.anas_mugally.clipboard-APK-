package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.collection.C2390a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.firebase.messaging.d0 */
/* JADX INFO: loaded from: classes.dex */
class C4983d0 {

    /* JADX INFO: renamed from: i */
    private static final long f18919i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a */
    private final Context f18920a;

    /* JADX INFO: renamed from: b */
    private final C4957G f18921b;

    /* JADX INFO: renamed from: c */
    private final C4951B f18922c;

    /* JADX INFO: renamed from: d */
    private final FirebaseMessaging f18923d;

    /* JADX INFO: renamed from: f */
    private final ScheduledExecutorService f18925f;

    /* JADX INFO: renamed from: h */
    private final C4979b0 f18927h;

    /* JADX INFO: renamed from: e */
    private final Map f18924e = new C2390a();

    /* JADX INFO: renamed from: g */
    private boolean f18926g = false;

    private C4983d0(FirebaseMessaging firebaseMessaging, C4957G c4957g, C4979b0 c4979b0, C4951B c4951b, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f18923d = firebaseMessaging;
        this.f18921b = c4957g;
        this.f18927h = c4979b0;
        this.f18922c = c4951b;
        this.f18920a = context;
        this.f18925f = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C4983d0 m22471a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C4957G c4957g, C4951B c4951b) {
        return new C4983d0(firebaseMessaging, c4957g, C4979b0.m22448b(context, scheduledExecutorService), c4951b, context, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: b */
    private void m22472b(C4977a0 c4977a0, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f18924e) {
            try {
                String strM22442e = c4977a0.m22442e();
                if (this.f18924e.containsKey(strM22442e)) {
                    arrayDeque = (ArrayDeque) this.f18924e.get(strM22442e);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f18924e.put(strM22442e, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m22473c(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e7) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e7);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e8);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m22474d(String str) throws IOException {
        m22473c(this.f18922c.m22256l(this.f18923d.m22318k(), str));
    }

    /* JADX INFO: renamed from: e */
    private void m22475e(String str) throws IOException {
        m22473c(this.f18922c.m22257m(this.f18923d.m22318k(), str));
    }

    /* JADX INFO: renamed from: f */
    static Task m22476f(final FirebaseMessaging firebaseMessaging, final C4957G c4957g, final C4951B c4951b, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4983d0.m22471a(context, scheduledExecutorService, firebaseMessaging, c4957g, c4951b);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    static boolean m22477h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: j */
    private void m22478j(C4977a0 c4977a0) {
        synchronized (this.f18924e) {
            try {
                String strM22442e = c4977a0.m22442e();
                if (this.f18924e.containsKey(strM22442e)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f18924e.get(strM22442e);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f18924e.remove(strM22442e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private void m22479o() {
        if (m22481i()) {
            return;
        }
        m22489s(0L);
    }

    /* JADX INFO: renamed from: g */
    boolean m22480g() {
        return this.f18927h.m22451c() != null;
    }

    /* JADX INFO: renamed from: i */
    synchronized boolean m22481i() {
        return this.f18926g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX INFO: renamed from: k */
    boolean m22482k(C4977a0 c4977a0) throws IOException {
        byte b7;
        try {
            String strM22440b = c4977a0.m22440b();
            int iHashCode = strM22440b.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strM22440b.equals("U")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (strM22440b.equals("S")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                m22474d(c4977a0.m22441c());
                if (m22477h()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + c4977a0.m22441c() + " succeeded.");
                }
            } else if (b7 == 1) {
                m22475e(c4977a0.m22441c());
                if (m22477h()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + c4977a0.m22441c() + " succeeded.");
                }
            } else if (m22477h()) {
                Log.d("FirebaseMessaging", "Unknown topic operation" + c4977a0 + ".");
            }
            return true;
        } catch (IOException e7) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e7.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e7.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e7.getMessage())) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e7.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    void m22483l(Runnable runnable, long j7) {
        this.f18925f.schedule(runnable, j7, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: m */
    Task m22484m(C4977a0 c4977a0) {
        this.f18927h.m22450a(c4977a0);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m22472b(c4977a0, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: n */
    synchronized void m22485n(boolean z7) {
        this.f18926g = z7;
    }

    /* JADX INFO: renamed from: p */
    void m22486p() {
        if (m22480g()) {
            m22479o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: q */
    public Task m22487q(String str) {
        Task taskM22484m = m22484m(C4977a0.m22439f(str));
        m22486p();
        return taskM22484m;
    }

    /* JADX INFO: renamed from: r */
    boolean m22488r() {
        while (true) {
            synchronized (this) {
                try {
                    C4977a0 c4977a0M22451c = this.f18927h.m22451c();
                    if (c4977a0M22451c == null) {
                        if (m22477h()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!m22482k(c4977a0M22451c)) {
                        return false;
                    }
                    this.f18927h.m22452e(c4977a0M22451c);
                    m22478j(c4977a0M22451c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    void m22489s(long j7) {
        m22483l(new RunnableC4985e0(this, this.f18920a, this.f18921b, Math.min(Math.max(30L, 2 * j7), f18919i)), j7);
        m22485n(true);
    }
}
