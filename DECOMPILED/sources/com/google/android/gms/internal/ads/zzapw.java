package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class zzapw implements zzapa {
    protected final zzapy zza;
    private final zzapv zzb;

    public zzapw(zzapv zzapvVar) {
        zzapy zzapyVar = new zzapy(4096);
        this.zzb = zzapvVar;
        this.zza = zzapyVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01be  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:119:0x0210  */
    /* JADX WARN: Code duplicated, block: B:146:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6  */
    @Override // com.google.android.gms.internal.ads.zzapa
    public zzapd zza(zzaph zzaphVar) throws Throwable {
        byte[] bArr;
        int iZza;
        zzapq zzapcVar;
        String str;
        zzapd zzapdVar;
        int iZzo;
        Map map;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            zzaqf zzaqfVar = null;
            try {
                zzaoq zzaoqVarZzk = zzaphVar.zzk();
                if (zzaoqVarZzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = zzaoqVarZzk.zzb;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j7 = zzaoqVarZzk.zzd;
                    if (j7 > 0) {
                        map2.put("If-Modified-Since", zzaqe.zzc(j7));
                    }
                    map = map2;
                }
                zzaqf zzaqfVarZza = this.zzb.zza(zzaphVar, map);
                try {
                    int iZza2 = zzaqfVarZza.zza();
                    List listZzb = zzaqfVarZza.zzb();
                    if (iZza2 == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzaoq zzaoqVarZzk2 = zzaphVar.zzk();
                        if (zzaoqVarZzk2 == null) {
                            return new zzapd(304, (byte[]) null, true, jElapsedRealtime2, listZzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzb.isEmpty()) {
                            Iterator it = listZzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzaoz) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzb);
                        List list = zzaoqVarZzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzaoz zzaozVar : zzaoqVarZzk2.zzh) {
                                    if (!treeSet.contains(zzaozVar.zza())) {
                                        arrayList.add(zzaozVar);
                                    }
                                }
                            }
                        } else if (!zzaoqVarZzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzaoqVarZzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzapd(304, zzaoqVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzd = zzaqfVarZza.zzd();
                    if (inputStreamZzd != null) {
                        int iZzc = zzaqfVarZza.zzc();
                        zzapy zzapyVar = this.zza;
                        zzaqj zzaqjVar = new zzaqj(zzapyVar, iZzc);
                        try {
                            bArrZza = zzapyVar.zza(1024);
                            while (true) {
                                try {
                                    int i7 = inputStreamZzd.read(bArrZza);
                                    if (i7 == -1) {
                                        break;
                                    }
                                    zzaqjVar.write(bArrZza, 0, i7);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzd.close();
                                    } catch (IOException unused) {
                                        zzapt.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzapyVar.zzb(bArrZza);
                                    zzaqjVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzaqjVar.toByteArray();
                            try {
                                inputStreamZzd.close();
                            } catch (IOException unused2) {
                                zzapt.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzapyVar.zzb(bArrZza);
                            zzaqjVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZza = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzapt.zzb || jElapsedRealtime3 > 3000) {
                            zzapt.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzaphVar, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(iZza2), Integer.valueOf(zzaphVar.zzy().zzb()));
                        }
                        if (iZza2 < 200 || iZza2 > 299) {
                            throw new IOException();
                        }
                        return new zzapd(iZza2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                    } catch (IOException e7) {
                        e = e7;
                        zzaqfVar = zzaqfVarZza;
                        bArr = bArr2;
                        if (e instanceof SocketTimeoutException) {
                            zzapcVar = new zzapp();
                            str = "socket";
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaphVar.zzh())), e);
                            }
                            if (zzaqfVar != null) {
                                throw new zzape(e);
                            }
                            iZza = zzaqfVar.zza();
                            zzapt.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzaphVar.zzh());
                            if (bArr != null) {
                                zzapdVar = new zzapd(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqfVar.zzb());
                                if (iZza == 401 && iZza != 403) {
                                    if (iZza < 400 || iZza > 499) {
                                        throw new zzapo(zzapdVar);
                                    }
                                    throw new zzaou(zzapdVar);
                                }
                                zzapcVar = new zzaop(zzapdVar);
                                str = "auth";
                            } else {
                                zzapcVar = new zzapc();
                                str = "network";
                            }
                        }
                        zzaov zzaovVarZzy = zzaphVar.zzy();
                        iZzo = zzaphVar.zzo();
                        try {
                            zzaovVarZzy.zzc(zzapcVar);
                            zzaphVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                        } catch (zzapq e8) {
                            zzaphVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iZzo)));
                            throw e8;
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                    bArr = null;
                    zzaqfVar = zzaqfVarZza;
                    if (e instanceof SocketTimeoutException) {
                        zzapcVar = new zzapp();
                        str = "socket";
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaphVar.zzh())), e);
                        }
                        if (zzaqfVar != null) {
                            throw new zzape(e);
                        }
                        iZza = zzaqfVar.zza();
                        zzapt.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzaphVar.zzh());
                        if (bArr != null) {
                            zzapdVar = new zzapd(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqfVar.zzb());
                            if (iZza == 401) {
                            }
                            zzapcVar = new zzaop(zzapdVar);
                            str = "auth";
                        } else {
                            zzapcVar = new zzapc();
                            str = "network";
                        }
                    }
                    zzaov zzaovVarZzy2 = zzaphVar.zzy();
                    iZzo = zzaphVar.zzo();
                    zzaovVarZzy2.zzc(zzapcVar);
                    zzaphVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                }
            } catch (IOException e10) {
                e = e10;
                bArr = null;
            }
            zzaphVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
        }
    }
}
