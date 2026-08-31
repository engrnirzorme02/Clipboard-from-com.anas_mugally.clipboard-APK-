package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzftu {
    public static InterfaceFutureC1673e zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfts zzftsVar = new zzfts(task, null);
        task.addOnCompleteListener(zzgpk.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzftt
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzfts zzftsVar2 = zzftsVar;
                if (task2.isCanceled()) {
                    zzftsVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzftsVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzftsVar2.zzb(exception);
            }
        });
        return zzftsVar;
    }
}
