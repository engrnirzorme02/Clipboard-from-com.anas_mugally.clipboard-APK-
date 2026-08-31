package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3756k;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7596m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeat implements zzfgm {
    protected final Context zza;
    protected final String zzb;

    public zzeat(Context context, String str, zzbvd zzbvdVar, int i7) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzeas zza(zzear zzearVar) {
        return zzc(zzearVar.zza, zzearVar.zzb, zzearVar.zzc, zzearVar.zzd, zzearVar.zze, C7351t.m32357o().mo18161c());
    }

    protected final zzeas zzc(String str, int i7, Map map, byte[] bArr, String str2, long j7) throws MalformedURLException, zzdwz {
        HttpURLConnection httpURLConnection;
        URL url;
        InputStreamReader inputStreamReader;
        try {
            zzeas zzeasVar = new zzeas();
            String str3 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String string = sb.toString();
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e(string);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 39);
            sb2.append("AdRequestServiceImpl: Sending request: ");
            sb2.append(str);
            AbstractC7599p.m33326a(sb2.toString());
            URL url2 = new URL(str);
            HashMap map2 = new HashMap();
            int i9 = 0;
            while (true) {
                int i10 = zzfqt.zzb;
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    try {
                        C7351t.m32349g().m17436L(this.zza, str3, false, httpURLConnection, false, i7);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = null;
                        C7596m c7596m = new C7596m(null);
                        try {
                            c7596m.m33313a(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            AbstractC7599p.m33329d("Network request logging failed.", th);
                            C7351t.m32354l().zzh(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    AbstractC3756k.m18186a(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    AbstractC3756k.m18186a(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        c7596m.m33315c(httpURLConnection, responseCode);
                        zzeasVar.zza = responseCode;
                        zzeasVar.zzb = map2;
                        zzeasVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    C7351t.m32349g();
                                    StringBuilder sb3 = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i11 = inputStreamReader2.read(cArr);
                                        if (i11 == -1) {
                                            break;
                                        }
                                        sb3.append(cArr, 0, i11);
                                    }
                                    String string2 = sb3.toString();
                                    AbstractC3756k.m18186a(inputStreamReader2);
                                    c7596m.m33317e(string2);
                                    zzeasVar.zzc = string2;
                                    if (TextUtils.isEmpty(string2)) {
                                        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfZ)).booleanValue()) {
                                            throw new zzdwz(3);
                                        }
                                    }
                                    zzeasVar.zzd = C7351t.m32357o().mo18161c() - j7;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    AbstractC3756k.m18186a(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb4.append("Received error HTTP response code: ");
                                sb4.append(responseCode);
                                AbstractC7599p.m33331f(sb4.toString());
                                StringBuilder sb5 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                sb5.append("Received error HTTP response code: ");
                                sb5.append(responseCode);
                                throw new zzdwz(1, sb5.toString());
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                AbstractC7599p.m33331f("No location header to follow redirect.");
                                throw new zzdwz(1, "No location header to follow redirect");
                            }
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zziz)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e7) {
                                    throw new zzdwz(1, e7.getMessage(), e7);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            int i12 = i9 + 1;
                            if (i12 > ((Integer) C3250D.m17200c().zzd(zzbci.zzfI)).intValue()) {
                                AbstractC7599p.m33331f("Too many redirects.");
                                throw new zzdwz(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            i9 = i12;
                            url2 = url;
                        }
                    } catch (zzdwz e8) {
                        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjb)).booleanValue()) {
                            throw e8;
                        }
                        zzeasVar.zzd = C7351t.m32357o().mo18161c() - j7;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return zzeasVar;
        } catch (IOException e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            int i13 = AbstractC3490o0.f14278b;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            AbstractC7599p.m33331f(strConcat);
            throw new zzdwz(1, strConcat, e9);
        }
    }
}
