package p067I1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p019C1.C0132h;
import p019C1.InterfaceC0128d;
import p183Y1.AbstractC2012a;

/* JADX INFO: renamed from: I1.c */
/* JADX INFO: loaded from: classes.dex */
public class C0583c implements InterfaceC0128d {
    @Override // p019C1.InterfaceC0128d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo589a(ByteBuffer byteBuffer, File file, C0132h c0132h) throws Throwable {
        try {
            AbstractC2012a.m8378f(byteBuffer, file);
            return true;
        } catch (IOException e7) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e7);
            return false;
        }
    }
}
