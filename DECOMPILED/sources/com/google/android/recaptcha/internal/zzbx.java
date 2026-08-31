package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p318o6.AbstractC6702z;
import p318o6.InterfaceC6639V;
import p318o6.InterfaceC6698x;
import p318o6.InterfaceC6701y0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbx {
    public static final InterfaceC6639V zza(Task task) {
        final InterfaceC6698x interfaceC6698xM28298b = AbstractC6702z.m28298b(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC6698x interfaceC6698x = interfaceC6698xM28298b;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC6698x.mo28288o0(exception);
                } else if (task2.isCanceled()) {
                    InterfaceC6701y0.a.m28291b(interfaceC6698x, null, 1, null);
                } else {
                    interfaceC6698x.mo28289p0(task2.getResult());
                }
            }
        });
        return new zzbw(interfaceC6698xM28298b);
    }
}
