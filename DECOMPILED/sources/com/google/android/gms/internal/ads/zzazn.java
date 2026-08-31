package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazn {
    private final int zza;
    private final zzazk zzb = new zzazp();

    public zzazn(int i7) {
        this.zza = i7;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            sb.append(((String) arrayList.get(i7)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzazm zzazmVar = new zzazm();
        int i8 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i8, new zzazl(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzazo.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzazr.zza(strArrZzb, i8, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazmVar.zzb.write(this.zzb.zza(((zzazq) it.next()).zzb));
            } catch (IOException e7) {
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error while writing hash to byteStream", e7);
            }
        }
        return zzazmVar.toString();
    }
}
