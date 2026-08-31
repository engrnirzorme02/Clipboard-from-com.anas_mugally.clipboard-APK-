package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3458X;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;
import p404z2.C7596m;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcct extends zzccq {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcct(zzcbd zzcbdVar) {
        super(zzcbdVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqm.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i9 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfqm.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0456  */
    /* JADX WARN: Code duplicated, block: B:176:0x0468  */
    /* JADX WARN: Code duplicated, block: B:177:0x048c  */
    /* JADX WARN: Code duplicated, block: B:180:0x04b5  */
    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(final String str) {
        int i7;
        File file;
        String str2;
        String str3;
        String string;
        FileOutputStream fileOutputStream;
        String string2;
        int i8;
        ByteBuffer byteBuffer;
        int responseCode;
        boolean zDelete;
        String str4 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                i7 = 0;
            } else {
                File[] fileArrListFiles = file2.listFiles();
                int length = fileArrListFiles.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length) {
                    int i11 = length;
                    int i12 = i9;
                    if (!fileArrListFiles[i9].getName().endsWith(".done")) {
                        i10++;
                    }
                    i9 = i12 + 1;
                    length = i11;
                }
                i7 = i10;
            }
            String str5 = str4;
            if (i7 > ((Integer) C3250D.m17200c().zzd(zzbci.zzs)).intValue()) {
                File file3 = this.zzg;
                if (file3 != null) {
                    File[] fileArrListFiles2 = file3.listFiles();
                    int length2 = fileArrListFiles2.length;
                    int i13 = 0;
                    long j7 = Long.MAX_VALUE;
                    File file4 = null;
                    while (i13 < length2) {
                        File file5 = fileArrListFiles2[i13];
                        int i14 = length2;
                        int i15 = i13;
                        if (!file5.getName().endsWith(".done")) {
                            long jLastModified = file5.lastModified();
                            if (jLastModified < j7) {
                                file4 = file5;
                                j7 = jLastModified;
                            }
                        }
                        i13 = i15 + 1;
                        length2 = i14;
                    }
                    if (file4 != null) {
                        boolean zDelete2 = file4.delete();
                        File fileZza = zza(file4);
                        zDelete = fileZza.isFile() ? fileZza.delete() & zDelete2 : zDelete2;
                    } else {
                        zDelete = false;
                    }
                    if (zDelete) {
                        str4 = str5;
                    }
                }
                int i16 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Unable to expire stream cache");
                zzq(str, null, "expireFailed", null);
                return false;
            }
            File file6 = new File(zzfqm.zza().zza(this.zzg, C7590g.m33285o(str)));
            File fileZza2 = zza(file6);
            if (file6.isFile() && fileZza2.isFile()) {
                int length3 = (int) file6.length();
                String strValueOf = String.valueOf(str);
                int i17 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Stream cache hit at ".concat(strValueOf));
                zzo(str, file6.getAbsolutePath(), length3);
                return true;
            }
            String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
            String strValueOf3 = String.valueOf(str);
            Set set = zze;
            String strConcat = strValueOf2.concat(strValueOf3);
            synchronized (set) {
                try {
                    if (set.contains(strConcat)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                        sb.append("Stream cache already in progress at ");
                        sb.append(str);
                        String string3 = sb.toString();
                        int i18 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f(string3);
                        zzq(str, file6.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    try {
                        str2 = "error";
                        try {
                            try {
                                HttpURLConnection httpURLConnectionZzh = zzfqy.zza().zzh(new zzfra() { // from class: com.google.android.gms.internal.ads.zzccs
                                    @Override // com.google.android.gms.internal.ads.zzfra
                                    public final /* synthetic */ URLConnection zza() throws IOException {
                                        int i19 = zzcct.zzd;
                                        C7351t.m32363u();
                                        int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzS)).intValue();
                                        URL url = new URL(str);
                                        int i20 = 0;
                                        while (true) {
                                            i20++;
                                            if (i20 > 20) {
                                                throw new IOException("Too many redirects (20)");
                                            }
                                            int i21 = zzfqt.zzb;
                                            URLConnection uRLConnectionOpenConnection = url.openConnection();
                                            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                                throw new IOException("Invalid protocol.");
                                            }
                                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                            C7596m c7596m = new C7596m(null);
                                            c7596m.m33313a(httpURLConnection, null);
                                            httpURLConnection.setInstanceFollowRedirects(false);
                                            int responseCode2 = httpURLConnection.getResponseCode();
                                            c7596m.m33315c(httpURLConnection, responseCode2);
                                            if (responseCode2 / 100 != 3) {
                                                return httpURLConnection;
                                            }
                                            String headerField = httpURLConnection.getHeaderField("Location");
                                            if (headerField == null) {
                                                throw new IOException("Missing Location header in redirect");
                                            }
                                            URL url2 = new URL(url, headerField);
                                            String protocol = url2.getProtocol();
                                            if (protocol == null) {
                                                throw new IOException("Protocol is null");
                                            }
                                            if (!protocol.equals("http") && !protocol.equals("https")) {
                                                throw new IOException("Unsupported scheme: ".concat(protocol));
                                            }
                                            String strConcat2 = "Redirecting to ".concat(headerField);
                                            int i22 = AbstractC3490o0.f14278b;
                                            AbstractC7599p.m33326a(strConcat2);
                                            httpURLConnection.disconnect();
                                            url = url2;
                                        }
                                    }
                                }, 265, -1);
                                if (httpURLConnectionZzh != null && (responseCode = httpURLConnectionZzh.getResponseCode()) >= 400) {
                                    str3 = "badUrl";
                                    try {
                                        String string4 = Integer.toString(responseCode);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(string4).length() + 27);
                                        sb2.append("HTTP request failed. Code: ");
                                        sb2.append(string4);
                                        string = sb2.toString();
                                        try {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str).length());
                                            sb3.append("HTTP status code ");
                                            sb3.append(responseCode);
                                            sb3.append(" at ");
                                            sb3.append(str);
                                            throw new IOException(sb3.toString());
                                        } catch (IOException | RuntimeException e7) {
                                            e = e7;
                                            file = file6;
                                            fileOutputStream = null;
                                            if (e instanceof RuntimeException) {
                                                C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException | NullPointerException unused) {
                                            }
                                            if (this.zzh) {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 26);
                                                sb4.append("Preload aborted for URL \"");
                                                sb4.append(str);
                                                sb4.append("\"");
                                                String string5 = sb4.toString();
                                                int i19 = AbstractC3490o0.f14278b;
                                                AbstractC7599p.m33330e(string5);
                                            } else {
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 25);
                                                sb5.append("Preload failed for URL \"");
                                                sb5.append(str);
                                                sb5.append("\"");
                                                String string6 = sb5.toString();
                                                int i20 = AbstractC3490o0.f14278b;
                                                AbstractC7599p.m33332g(string6, e);
                                            }
                                            if (file.exists()) {
                                                AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                            }
                                            zzq(str, file.getAbsolutePath(), str3, string);
                                            zze.remove(strConcat);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e8) {
                                        e = e8;
                                        file = file6;
                                        string = null;
                                        fileOutputStream = null;
                                        if (e instanceof RuntimeException) {
                                            C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 26);
                                            sb6.append("Preload aborted for URL \"");
                                            sb6.append(str);
                                            sb6.append("\"");
                                            String string7 = sb6.toString();
                                            int i110 = AbstractC3490o0.f14278b;
                                            AbstractC7599p.m33330e(string7);
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 25);
                                            sb7.append("Preload failed for URL \"");
                                            sb7.append(str);
                                            sb7.append("\"");
                                            String string8 = sb7.toString();
                                            int i21 = AbstractC3490o0.f14278b;
                                            AbstractC7599p.m33332g(string8, e);
                                        }
                                        if (file.exists()) {
                                            AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                        }
                                        zzq(str, file.getAbsolutePath(), str3, string);
                                        zze.remove(strConcat);
                                        return false;
                                    }
                                }
                                int contentLength = httpURLConnectionZzh.getContentLength();
                                if (contentLength < 0) {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 55);
                                    sb8.append("Stream cache aborted, missing content-length header at ");
                                    sb8.append(str);
                                    String string9 = sb8.toString();
                                    int i22 = AbstractC3490o0.f14278b;
                                    AbstractC7599p.m33331f(string9);
                                    zzq(str, file6.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                DecimalFormat decimalFormat = zzf;
                                String str6 = decimalFormat.format(contentLength);
                                int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzt)).intValue();
                                str3 = "File too big for full file cache. Size: ";
                                if (contentLength > iIntValue) {
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(str6).length() + 33 + String.valueOf(str).length());
                                    sb9.append("Content length ");
                                    sb9.append(str6);
                                    sb9.append(" exceeds limit at ");
                                    sb9.append(str);
                                    String string10 = sb9.toString();
                                    int i23 = AbstractC3490o0.f14278b;
                                    AbstractC7599p.m33331f(string10);
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(str6).length() + 40);
                                    sb10.append("File too big for full file cache. Size: ");
                                    sb10.append(str6);
                                    zzq(str, file6.getAbsolutePath(), "sizeExceeded", sb10.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                StringBuilder sb11 = new StringBuilder(String.valueOf(str6).length() + 20 + String.valueOf(str).length());
                                sb11.append("Caching ");
                                sb11.append(str6);
                                sb11.append(" bytes from ");
                                sb11.append(str);
                                String string11 = sb11.toString();
                                int i24 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33326a(string11);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzh.getInputStream());
                                file = file6;
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        try {
                                            FileChannel channel = fileOutputStream.getChannel();
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                            InterfaceC3750e interfaceC3750eM32357o = C7351t.m32357o();
                                            long jMo18159a = interfaceC3750eM32357o.mo18159a();
                                            C3458X c3458x = new C3458X(((Long) C3250D.m17200c().zzd(zzbci.zzR)).longValue());
                                            long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzQ)).longValue();
                                            int i25 = 0;
                                            while (true) {
                                                int i26 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                                if (i26 < 0) {
                                                    fileOutputStream.close();
                                                    if (AbstractC7599p.m33335j(3)) {
                                                        String str7 = decimalFormat.format(i25);
                                                        StringBuilder sb12 = new StringBuilder(String.valueOf(str7).length() + 22 + String.valueOf(str).length());
                                                        sb12.append(str5);
                                                        sb12.append(str7);
                                                        sb12.append(" bytes from ");
                                                        sb12.append(str);
                                                        AbstractC7599p.m33326a(sb12.toString());
                                                    }
                                                    file.setReadable(true, false);
                                                    if (fileZza2.isFile()) {
                                                        fileZza2.setLastModified(System.currentTimeMillis());
                                                    } else {
                                                        try {
                                                            fileZza2.createNewFile();
                                                        } catch (IOException unused2) {
                                                        }
                                                    }
                                                    zzo(str, file.getAbsolutePath(), i25);
                                                    zze.remove(strConcat);
                                                    return true;
                                                }
                                                i25 += i26;
                                                if (i25 > iIntValue) {
                                                    try {
                                                        String string12 = Integer.toString(i25);
                                                        StringBuilder sb13 = new StringBuilder(String.valueOf(string12).length() + 40);
                                                        sb13.append("File too big for full file cache. Size: ");
                                                        sb13.append(string12);
                                                        string2 = sb13.toString();
                                                        try {
                                                            throw new IOException("stream cache file size limit exceeded");
                                                        } catch (IOException | RuntimeException e9) {
                                                            e = e9;
                                                            str3 = "sizeExceeded";
                                                            string = string2;
                                                            fileOutputStream = fileOutputStream;
                                                            if (e instanceof RuntimeException) {
                                                                C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                StringBuilder sb14 = new StringBuilder(String.valueOf(str).length() + 26);
                                                                sb14.append("Preload aborted for URL \"");
                                                                sb14.append(str);
                                                                sb14.append("\"");
                                                                String string13 = sb14.toString();
                                                                int i111 = AbstractC3490o0.f14278b;
                                                                AbstractC7599p.m33330e(string13);
                                                            } else {
                                                                StringBuilder sb15 = new StringBuilder(String.valueOf(str).length() + 25);
                                                                sb15.append("Preload failed for URL \"");
                                                                sb15.append(str);
                                                                sb15.append("\"");
                                                                String string14 = sb15.toString();
                                                                int i27 = AbstractC3490o0.f14278b;
                                                                AbstractC7599p.m33332g(string14, e);
                                                            }
                                                            if (file.exists()) {
                                                                AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str3, string);
                                                            zze.remove(strConcat);
                                                            return false;
                                                        }
                                                    } catch (IOException | RuntimeException e10) {
                                                        e = e10;
                                                        str3 = "sizeExceeded";
                                                        string = null;
                                                        if (e instanceof RuntimeException) {
                                                            C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                            StringBuilder sb16 = new StringBuilder(String.valueOf(str).length() + 26);
                                                            sb16.append("Preload aborted for URL \"");
                                                            sb16.append(str);
                                                            sb16.append("\"");
                                                            String string15 = sb16.toString();
                                                            int i112 = AbstractC3490o0.f14278b;
                                                            AbstractC7599p.m33330e(string15);
                                                        } else {
                                                            StringBuilder sb17 = new StringBuilder(String.valueOf(str).length() + 25);
                                                            sb17.append("Preload failed for URL \"");
                                                            sb17.append(str);
                                                            sb17.append("\"");
                                                            String string16 = sb17.toString();
                                                            int i28 = AbstractC3490o0.f14278b;
                                                            AbstractC7599p.m33332g(string16, e);
                                                        }
                                                        if (file.exists()) {
                                                            AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                        }
                                                        zzq(str, file.getAbsolutePath(), str3, string);
                                                        zze.remove(strConcat);
                                                        return false;
                                                    }
                                                }
                                                byteBufferAllocate.flip();
                                                while (channel.write(byteBufferAllocate) > 0) {
                                                }
                                                byteBufferAllocate.clear();
                                                try {
                                                    if (interfaceC3750eM32357o.mo18159a() - jMo18159a > 1000 * jLongValue) {
                                                        str3 = "downloadTimeout";
                                                        String string17 = Long.toString(jLongValue);
                                                        StringBuilder sb18 = new StringBuilder(String.valueOf(string17).length() + 29);
                                                        sb18.append("Timeout exceeded. Limit: ");
                                                        sb18.append(string17);
                                                        sb18.append(" sec");
                                                        string2 = sb18.toString();
                                                        try {
                                                            throw new IOException("stream cache time limit exceeded");
                                                        } catch (IOException e11) {
                                                            e = e11;
                                                            string = string2;
                                                            fileOutputStream = fileOutputStream;
                                                            if (e instanceof RuntimeException) {
                                                                C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                StringBuilder sb19 = new StringBuilder(String.valueOf(str).length() + 26);
                                                                sb19.append("Preload aborted for URL \"");
                                                                sb19.append(str);
                                                                sb19.append("\"");
                                                                String string18 = sb19.toString();
                                                                int i113 = AbstractC3490o0.f14278b;
                                                                AbstractC7599p.m33330e(string18);
                                                            } else {
                                                                StringBuilder sb110 = new StringBuilder(String.valueOf(str).length() + 25);
                                                                sb110.append("Preload failed for URL \"");
                                                                sb110.append(str);
                                                                sb110.append("\"");
                                                                String string19 = sb110.toString();
                                                                int i29 = AbstractC3490o0.f14278b;
                                                                AbstractC7599p.m33332g(string19, e);
                                                            }
                                                            if (file.exists()) {
                                                                AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str3, string);
                                                            zze.remove(strConcat);
                                                            return false;
                                                        } catch (RuntimeException e12) {
                                                            e = e12;
                                                            string = string2;
                                                            fileOutputStream = fileOutputStream;
                                                            if (e instanceof RuntimeException) {
                                                                C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                StringBuilder sb111 = new StringBuilder(String.valueOf(str).length() + 26);
                                                                sb111.append("Preload aborted for URL \"");
                                                                sb111.append(str);
                                                                sb111.append("\"");
                                                                String string110 = sb111.toString();
                                                                int i114 = AbstractC3490o0.f14278b;
                                                                AbstractC7599p.m33330e(string110);
                                                            } else {
                                                                StringBuilder sb112 = new StringBuilder(String.valueOf(str).length() + 25);
                                                                sb112.append("Preload failed for URL \"");
                                                                sb112.append(str);
                                                                sb112.append("\"");
                                                                String string111 = sb112.toString();
                                                                int i210 = AbstractC3490o0.f14278b;
                                                                AbstractC7599p.m33332g(string111, e);
                                                            }
                                                            if (file.exists()) {
                                                                AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str3, string);
                                                            zze.remove(strConcat);
                                                            return false;
                                                        }
                                                    }
                                                    if (this.zzh) {
                                                        throw new IOException("abort requested");
                                                    }
                                                    if (c3458x.m17506a()) {
                                                        byteBuffer = byteBufferAllocate;
                                                        i8 = contentLength;
                                                        C7590g.f30239b.post(new zzcck(this, str, file.getAbsolutePath(), i25, i8, false));
                                                    } else {
                                                        i8 = contentLength;
                                                        byteBuffer = byteBufferAllocate;
                                                    }
                                                    contentLength = i8;
                                                    c3458x = c3458x;
                                                    byteBufferAllocate = byteBuffer;
                                                    readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    string = null;
                                                    if (e instanceof RuntimeException) {
                                                        C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                        StringBuilder sb113 = new StringBuilder(String.valueOf(str).length() + 26);
                                                        sb113.append("Preload aborted for URL \"");
                                                        sb113.append(str);
                                                        sb113.append("\"");
                                                        String string112 = sb113.toString();
                                                        int i115 = AbstractC3490o0.f14278b;
                                                        AbstractC7599p.m33330e(string112);
                                                    } else {
                                                        StringBuilder sb114 = new StringBuilder(String.valueOf(str).length() + 25);
                                                        sb114.append("Preload failed for URL \"");
                                                        sb114.append(str);
                                                        sb114.append("\"");
                                                        String string113 = sb114.toString();
                                                        int i211 = AbstractC3490o0.f14278b;
                                                        AbstractC7599p.m33332g(string113, e);
                                                    }
                                                    if (file.exists()) {
                                                        AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str3, string);
                                                    zze.remove(strConcat);
                                                    return false;
                                                } catch (RuntimeException e14) {
                                                    e = e14;
                                                    string = null;
                                                    if (e instanceof RuntimeException) {
                                                        C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                        StringBuilder sb115 = new StringBuilder(String.valueOf(str).length() + 26);
                                                        sb115.append("Preload aborted for URL \"");
                                                        sb115.append(str);
                                                        sb115.append("\"");
                                                        String string114 = sb115.toString();
                                                        int i116 = AbstractC3490o0.f14278b;
                                                        AbstractC7599p.m33330e(string114);
                                                    } else {
                                                        StringBuilder sb116 = new StringBuilder(String.valueOf(str).length() + 25);
                                                        sb116.append("Preload failed for URL \"");
                                                        sb116.append(str);
                                                        sb116.append("\"");
                                                        String string115 = sb116.toString();
                                                        int i212 = AbstractC3490o0.f14278b;
                                                        AbstractC7599p.m33332g(string115, e);
                                                    }
                                                    if (file.exists()) {
                                                        AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str3, string);
                                                    zze.remove(strConcat);
                                                    return false;
                                                }
                                                if (e instanceof RuntimeException) {
                                                    C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                }
                                                fileOutputStream.close();
                                                if (this.zzh) {
                                                    StringBuilder sb117 = new StringBuilder(String.valueOf(str).length() + 26);
                                                    sb117.append("Preload aborted for URL \"");
                                                    sb117.append(str);
                                                    sb117.append("\"");
                                                    String string116 = sb117.toString();
                                                    int i117 = AbstractC3490o0.f14278b;
                                                    AbstractC7599p.m33330e(string116);
                                                } else {
                                                    StringBuilder sb118 = new StringBuilder(String.valueOf(str).length() + 25);
                                                    sb118.append("Preload failed for URL \"");
                                                    sb118.append(str);
                                                    sb118.append("\"");
                                                    String string117 = sb118.toString();
                                                    int i213 = AbstractC3490o0.f14278b;
                                                    AbstractC7599p.m33332g(string117, e);
                                                }
                                                if (file.exists() && !file.delete()) {
                                                    AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                }
                                                zzq(str, file.getAbsolutePath(), str3, string);
                                                zze.remove(strConcat);
                                                return false;
                                                string = null;
                                                if (e instanceof RuntimeException) {
                                                    C7351t.m32354l().zzg(e, "VideoStreamFullFileCache.preload");
                                                }
                                                fileOutputStream.close();
                                                if (this.zzh) {
                                                    StringBuilder sb119 = new StringBuilder(String.valueOf(str).length() + 26);
                                                    sb119.append("Preload aborted for URL \"");
                                                    sb119.append(str);
                                                    sb119.append("\"");
                                                    String string118 = sb119.toString();
                                                    int i118 = AbstractC3490o0.f14278b;
                                                    AbstractC7599p.m33330e(string118);
                                                } else {
                                                    StringBuilder sb1110 = new StringBuilder(String.valueOf(str).length() + 25);
                                                    sb1110.append("Preload failed for URL \"");
                                                    sb1110.append(str);
                                                    sb1110.append("\"");
                                                    String string119 = sb1110.toString();
                                                    int i214 = AbstractC3490o0.f14278b;
                                                    AbstractC7599p.m33332g(string119, e);
                                                }
                                                if (file.exists()) {
                                                    AbstractC7599p.m33331f("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                }
                                                zzq(str, file.getAbsolutePath(), str3, string);
                                                zze.remove(strConcat);
                                                return false;
                                            }
                                        } catch (IOException e15) {
                                            e = e15;
                                            str3 = str2;
                                        }
                                    } catch (RuntimeException e16) {
                                        e = e16;
                                        str3 = str2;
                                    }
                                } catch (IOException e17) {
                                    e = e17;
                                    str3 = str2;
                                    string = null;
                                    fileOutputStream = null;
                                } catch (RuntimeException e18) {
                                    e = e18;
                                    str3 = str2;
                                    string = null;
                                    fileOutputStream = null;
                                }
                            } catch (IOException | RuntimeException e19) {
                                e = e19;
                                file = file6;
                            }
                        } catch (IOException | RuntimeException e20) {
                            e = e20;
                            file = file6;
                        }
                    } catch (IOException | RuntimeException e21) {
                        e = e21;
                        file = file6;
                        str2 = "error";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
        this.zzh = true;
    }
}
