package p396y2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.AbstractC3422B;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Objects;
import p380w2.C7343l;
import p380w2.C7351t;

/* JADX INFO: renamed from: y2.t */
/* JADX INFO: loaded from: classes.dex */
final class C7532t extends AbstractC3422B {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractBinderC7534v f30148a;

    /* synthetic */ C7532t(AbstractBinderC7534v abstractBinderC7534v, byte[] bArr) {
        Objects.requireNonNull(abstractBinderC7534v);
        this.f30148a = abstractBinderC7534v;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3422B
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        AbstractBinderC7534v abstractBinderC7534v = this.f30148a;
        Bitmap bitmapM17491a = C7351t.m32341C().m17491a(Integer.valueOf(abstractBinderC7534v.f30158b.f14157z.f29225f));
        if (bitmapM17491a != null) {
            C7351t.m32349g();
            C7343l c7343l = abstractBinderC7534v.f30158b.f14157z;
            boolean z7 = c7343l.f29223d;
            float f7 = c7343l.f29224e;
            Activity activity = abstractBinderC7534v.f30157a;
            if (!z7 || f7 <= 0.0f || f7 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapM17491a);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM17491a, bitmapM17491a.getWidth(), bitmapM17491a.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f7);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapM17491a);
                }
            }
            C3431F0.f14180l.post(new Runnable() { // from class: y2.s
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f30146a.f30148a.f30157a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
