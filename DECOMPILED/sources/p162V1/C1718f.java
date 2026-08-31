package p162V1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: V1.f */
/* JADX INFO: loaded from: classes.dex */
public class C1718f {
    /* JADX INFO: renamed from: a */
    public AbstractC1721i m7322a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C1714b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C1716d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
