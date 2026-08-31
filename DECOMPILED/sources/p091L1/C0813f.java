package p091L1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p043F1.C0407e;
import p043F1.InterfaceC0406d;
import p083K1.C0733h;

/* JADX INFO: renamed from: L1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0813f implements InterfaceC0134j {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0406d f3250a = new C0407e();

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC0301v mo605a(Object obj, int i7, int i8, C0132h c0132h) {
        return m3803c(AbstractC0811d.m3801a(obj), i7, i8, c0132h);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo606b(Object obj, C0132h c0132h) {
        return m3804d(AbstractC0811d.m3801a(obj), c0132h);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0301v m3803c(ImageDecoder.Source source, int i7, int i8, C0132h c0132h) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C0733h(i7, i8, c0132h));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i7 + "x" + i8 + "]");
        }
        return new C0814g(bitmapDecodeBitmap, this.f3250a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3804d(ImageDecoder.Source source, C0132h c0132h) {
        return true;
    }
}
