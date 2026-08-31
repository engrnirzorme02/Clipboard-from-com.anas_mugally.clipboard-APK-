package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfp {
    private final zzfo zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzfn zzf;

    public zzfp(zzfo zzfoVar) {
        this.zza = zzfoVar;
    }

    private final void zzf(int i7) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i7) {
                return;
            }
            zzfn zzfnVar = (zzfn) priorityQueue.poll();
            String str = zzeo.zza;
            int i8 = 0;
            while (true) {
                list = zzfnVar.zza;
                if (i8 >= list.size()) {
                    break;
                }
                this.zza.zza(zzfnVar.zzb, (zzef) list.get(i8));
                this.zzb.push((zzef) list.get(i8));
                i8++;
            }
            list.clear();
            zzfn zzfnVar2 = this.zzf;
            if (zzfnVar2 != null && zzfnVar2.zzb == zzfnVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzfnVar);
        }
    }

    public final void zza(int i7) {
        zzghc.zzh(i7 >= 0);
        this.zze = i7;
        zzf(i7);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j7, zzef zzefVar) {
        int i7 = this.zze;
        if (i7 != 0) {
            if (i7 != -1) {
                PriorityQueue priorityQueue = this.zzd;
                if (priorityQueue.size() >= this.zze) {
                    zzfn zzfnVar = (zzfn) priorityQueue.peek();
                    String str = zzeo.zza;
                }
            }
            ArrayDeque arrayDeque = this.zzb;
            zzef zzefVar2 = arrayDeque.isEmpty() ? new zzef() : (zzef) arrayDeque.pop();
            zzefVar2.zza(zzefVar.zzd());
            System.arraycopy(zzefVar.zzi(), zzefVar.zzg(), zzefVar2.zzi(), 0, zzefVar2.zzd());
            zzfn zzfnVar2 = this.zzf;
            if (zzfnVar2 != null && j7 == zzfnVar2.zzb) {
                zzfnVar2.zza.add(zzefVar2);
                return;
            }
            ArrayDeque arrayDeque2 = this.zzc;
            zzfn zzfnVar3 = arrayDeque2.isEmpty() ? new zzfn() : (zzfn) arrayDeque2.pop();
            zzghc.zza(j7 != -9223372036854775807L);
            List list = zzfnVar3.zza;
            zzghc.zzh(list.isEmpty());
            zzfnVar3.zzb = j7;
            list.add(zzefVar2);
            this.zzd.add(zzfnVar3);
            this.zzf = zzfnVar3;
            int i8 = this.zze;
            if (i8 != -1) {
                zzf(i8);
                return;
            }
            return;
        }
        this.zza.zza(j7, zzefVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
