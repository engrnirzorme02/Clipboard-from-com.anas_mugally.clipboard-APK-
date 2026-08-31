package p091L1;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.data.C3218c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.EnumC0127c;
import p019C1.InterfaceC0135k;
import p035E1.InterfaceC0301v;
import p043F1.InterfaceC0404b;
import p183Y1.AbstractC2018g;
import p183Y1.AbstractC2023l;
import p190Z1.AbstractC2084b;

/* JADX INFO: renamed from: L1.c */
/* JADX INFO: loaded from: classes.dex */
public class C0810c implements InterfaceC0135k {

    /* JADX INFO: renamed from: b */
    public static final C0131g f3247b = C0131g.m595f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final C0131g f3248c = C0131g.m594e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a */
    private final InterfaceC0404b f3249a;

    public C0810c(InterfaceC0404b interfaceC0404b) {
        this.f3249a = interfaceC0404b;
    }

    /* JADX INFO: renamed from: d */
    private Bitmap.CompressFormat m3799d(Bitmap bitmap, C0132h c0132h) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c0132h.m600c(f3248c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p019C1.InterfaceC0135k
    /* JADX INFO: renamed from: b */
    public EnumC0127c mo607b(C0132h c0132h) {
        return EnumC0127c.TRANSFORMED;
    }

    @Override // p019C1.InterfaceC0128d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo589a(InterfaceC0301v interfaceC0301v, File file, C0132h c0132h) {
        boolean z7;
        Bitmap bitmap = (Bitmap) interfaceC0301v.get();
        Bitmap.CompressFormat compressFormatM3799d = m3799d(bitmap, c0132h);
        AbstractC2084b.m8607d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatM3799d);
        try {
            long jM8393b = AbstractC2018g.m8393b();
            int iIntValue = ((Integer) c0132h.m600c(f3247b)).intValue();
            OutputStream c3218c = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        c3218c = this.f3249a != null ? new C3218c(fileOutputStream, this.f3249a) : fileOutputStream;
                        bitmap.compress(compressFormatM3799d, iIntValue, c3218c);
                        c3218c.close();
                        try {
                            c3218c.close();
                        } catch (IOException unused) {
                        }
                        z7 = true;
                    } catch (IOException e7) {
                        e = e7;
                        c3218c = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c3218c != null) {
                            try {
                                c3218c.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z7 = false;
                    } catch (Throwable th) {
                        th = th;
                        c3218c = fileOutputStream;
                        if (c3218c != null) {
                            try {
                                c3218c.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e8) {
                e = e8;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormatM3799d + " of size " + AbstractC2023l.m8417h(bitmap) + " in " + AbstractC2018g.m8392a(jM8393b) + ", options format: " + c0132h.m600c(f3248c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            AbstractC2084b.m8608e();
            return z7;
        } catch (Throwable th3) {
            AbstractC2084b.m8608e();
            throw th3;
        }
    }
}
