package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.internal.location.zzaz;

/* JADX INFO: renamed from: com.google.android.gms.location.r */
/* JADX INFO: loaded from: classes2.dex */
final class C3979r extends C3553a.a {
    C3979r() {
    }

    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* bridge */ /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        return new zzaz(context, looper, bVar, cVar, "activity_recognition", C3690e.m18004a(context));
    }
}
