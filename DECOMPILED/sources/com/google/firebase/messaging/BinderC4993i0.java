package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.i0 */
/* JADX INFO: loaded from: classes.dex */
class BinderC4993i0 extends Binder {

    /* JADX INFO: renamed from: a */
    private final a f18959a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.i0$a */
    interface a {
        /* JADX INFO: renamed from: a */
        Task mo22520a(Intent intent);
    }

    BinderC4993i0(a aVar) {
        this.f18959a = aVar;
    }

    /* JADX INFO: renamed from: b */
    void m22522b(final ServiceConnectionC4999l0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f18959a.mo22520a(aVar.f18971a).addOnCompleteListener(new ExecutorC2688k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.h0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.m22531d();
            }
        });
    }
}
