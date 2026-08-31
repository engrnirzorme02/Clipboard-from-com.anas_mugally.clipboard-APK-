package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6119o;
import p152T5.AbstractC1610H;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes2.dex */
final class zzat extends AbstractC6119o implements InterfaceC5356a {
    public static final zzat zza = new zzat();

    zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1610H.m6623e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // p238e6.InterfaceC5356a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
