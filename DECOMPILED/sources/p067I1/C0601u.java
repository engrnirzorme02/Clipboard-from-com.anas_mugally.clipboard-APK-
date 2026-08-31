package p067I1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p019C1.C0132h;
import p019C1.InterfaceC0128d;
import p043F1.InterfaceC0404b;

/* JADX INFO: renamed from: I1.u */
/* JADX INFO: loaded from: classes.dex */
public class C0601u implements InterfaceC0128d {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0404b f2308a;

    public C0601u(InterfaceC0404b interfaceC0404b) {
        this.f2308a = interfaceC0404b;
    }

    @Override // p019C1.InterfaceC0128d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo589a(InputStream inputStream, File file, C0132h c0132h) throws Throwable {
        byte[] bArr = (byte[]) this.f2308a.mo1739e(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i7 = inputStream.read(bArr);
                        if (i7 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                    } catch (IOException e7) {
                        e = e7;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f2308a.mo1738d(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f2308a.mo1738d(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f2308a.mo1738d(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }
}
