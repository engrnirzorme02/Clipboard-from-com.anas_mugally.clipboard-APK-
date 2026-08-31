package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4043G3 {

    /* JADX INFO: renamed from: a */
    final Context f15227a;

    /* JADX INFO: renamed from: b */
    Boolean f15228b;

    /* JADX INFO: renamed from: c */
    long f15229c;

    /* JADX INFO: renamed from: d */
    zzdd f15230d;

    /* JADX INFO: renamed from: e */
    boolean f15231e;

    /* JADX INFO: renamed from: f */
    final Long f15232f;

    /* JADX INFO: renamed from: g */
    String f15233g;

    public C4043G3(Context context, zzdd zzddVar, Long l7) {
        this.f15231e = true;
        AbstractC3718s.m18083l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC3718s.m18083l(applicationContext);
        this.f15227a = applicationContext;
        this.f15232f = l7;
        if (zzddVar != null) {
            this.f15230d = zzddVar;
            this.f15231e = zzddVar.zzc;
            this.f15229c = zzddVar.zzb;
            this.f15233g = zzddVar.zze;
            Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.f15228b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
