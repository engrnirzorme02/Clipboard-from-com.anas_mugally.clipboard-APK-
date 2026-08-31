package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.C3690e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends C3553a.a {
    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        return new zzk(context, looper, c3690e, bVar, cVar);
    }
}
