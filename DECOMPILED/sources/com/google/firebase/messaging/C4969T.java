package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.C2390a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.T */
/* JADX INFO: loaded from: classes.dex */
class C4969T {

    /* JADX INFO: renamed from: a */
    private final Executor f18852a;

    /* JADX INFO: renamed from: b */
    private final Map f18853b = new C2390a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.T$a */
    interface a {
        Task start();
    }

    C4969T(Executor executor) {
        this.f18852a = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m22399a(C4969T c4969t, String str, Task task) {
        synchronized (c4969t) {
            c4969t.f18853b.remove(str);
        }
        return task;
    }

    /* JADX INFO: renamed from: b */
    synchronized Task m22400b(final String str, a aVar) {
        Task task = (Task) this.f18853b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskContinueWithTask = aVar.start().continueWithTask(this.f18852a, new Continuation() { // from class: com.google.firebase.messaging.S
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C4969T.m22399a(this.f18850a, str, task2);
            }
        });
        this.f18853b.put(str, taskContinueWithTask);
        return taskContinueWithTask;
    }
}
