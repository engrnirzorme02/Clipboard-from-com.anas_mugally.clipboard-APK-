package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghq {
    private final zzghp zza;

    private zzghq(zzghp zzghpVar) {
        int i7 = zzggn.zzb;
        this.zza = zzghpVar;
    }

    public static zzghq zza(final zzggo zzggoVar) {
        return new zzghq(new zzghp() { // from class: com.google.android.gms.internal.ads.zzghn
            @Override // com.google.android.gms.internal.ads.zzghp
            public final /* synthetic */ Iterator zza(zzghq zzghqVar, CharSequence charSequence) {
                return new zzghh(zzghqVar, charSequence, zzggoVar);
            }
        });
    }

    public static zzghq zzb(Pattern pattern) {
        final zzggv zzggvVar = new zzggv(pattern);
        zzghc.zzf(!((zzggu) zzggvVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzggvVar);
        return new zzghq(new zzghp() { // from class: com.google.android.gms.internal.ads.zzghl
            @Override // com.google.android.gms.internal.ads.zzghp
            public final /* synthetic */ Iterator zza(zzghq zzghqVar, CharSequence charSequence) {
                return new zzghi(zzghqVar, charSequence, zzggvVar.zza(charSequence));
            }
        });
    }

    public static zzghq zzc(int i7) {
        final int i8 = 4000;
        return new zzghq(new zzghp(i8) { // from class: com.google.android.gms.internal.ads.zzghm
            @Override // com.google.android.gms.internal.ads.zzghp
            public final /* synthetic */ Iterator zza(zzghq zzghqVar, CharSequence charSequence) {
                return new zzghj(zzghqVar, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzghk(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzf.hasNext()) {
            arrayList.add((String) itZzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
