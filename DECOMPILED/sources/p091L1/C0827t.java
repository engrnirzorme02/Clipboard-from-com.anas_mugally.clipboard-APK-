package p091L1;

import androidx.exifinterface.media.C2572a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p043F1.InterfaceC0404b;
import p183Y1.AbstractC2012a;

/* JADX INFO: renamed from: L1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0827t implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo3827a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public int mo3828b(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
        return mo3831e(AbstractC2012a.m8379g(byteBuffer), interfaceC0404b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public boolean mo3829c(ByteBuffer byteBuffer, InterfaceC0404b interfaceC0404b) {
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: d */
    public ImageHeaderParser.ImageType mo3830d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: e */
    public int mo3831e(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        int iM11908c = new C2572a(inputStream).m11908c("Orientation", 1);
        if (iM11908c == 0) {
            return -1;
        }
        return iM11908c;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: f */
    public boolean mo3832f(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        return false;
    }
}
