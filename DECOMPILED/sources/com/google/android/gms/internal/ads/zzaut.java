package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaut extends zzaus {
    private zzaut(Context context, zzaur zzaurVar) {
        super(context, zzaurVar);
    }

    public static zzaut zzt(Context context, zzaqy zzaqyVar) {
        zzaur zzaurVar = new zzaur(zzaqyVar);
        zzaus.zzo(context, zzaurVar);
        return new zzaut(context, zzaurVar);
    }
}
