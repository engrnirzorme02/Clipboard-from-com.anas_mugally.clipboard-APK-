package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class zzhpi implements Iterator, Closeable, zzaqt {
    private static final zzaqs zza = new zzhph("eof ");
    protected zzaqp zzb;
    protected zzhpj zzc;
    zzaqs zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhpp.zzb(zzhpi.class);
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaqs zzaqsVar = this.zzd;
        if (zzaqsVar == zza) {
            return false;
        }
        if (zzaqsVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i7 = 0;
        while (true) {
            List list = this.zzg;
            if (i7 >= list.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i7 > 0) {
                sb.append(";");
            }
            sb.append(((zzaqs) list.get(i7)).toString());
            i7++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhpo(this.zzg, this);
    }

    public final void zzd(zzhpj zzhpjVar, long j7, zzaqp zzaqpVar) {
        this.zzc = zzhpjVar;
        this.zze = zzhpjVar.zzc();
        zzhpjVar.zzd(zzhpjVar.zzc() + j7);
        this.zzf = zzhpjVar.zzc();
        this.zzb = zzaqpVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaqs next() {
        zzaqs zzaqsVarZzb;
        zzaqs zzaqsVar = this.zzd;
        if (zzaqsVar != null && zzaqsVar != zza) {
            this.zzd = null;
            return zzaqsVar;
        }
        zzhpj zzhpjVar = this.zzc;
        if (zzhpjVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhpjVar) {
                this.zzc.zzd(this.zze);
                zzaqsVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzaqsVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
