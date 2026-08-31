package p396y2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.internal.ads.zzbci;
import p364u2.AbstractC7155a;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: renamed from: y2.A */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC7506A extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final ImageButton f30106a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7520h f30107b;

    public ViewOnClickListenerC7506A(Context context, C7538z c7538z, InterfaceC7520h interfaceC7520h) {
        super(context);
        this.f30107b = interfaceC7520h;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f30106a = imageButton;
        m33136c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C3244B.m17190a();
        int iM33276c = C7590g.m33276c(context, c7538z.f30173a);
        C3244B.m17190a();
        int iM33276c2 = C7590g.m33276c(context, 0);
        C3244B.m17190a();
        int iM33276c3 = C7590g.m33276c(context, c7538z.f30174b);
        C3244B.m17190a();
        imageButton.setPadding(iM33276c, iM33276c2, iM33276c3, C7590g.m33276c(context, c7538z.f30175c));
        imageButton.setContentDescription("Interstitial close button");
        C3244B.m17190a();
        int iM33276c4 = C7590g.m33276c(context, c7538z.f30176d + c7538z.f30173a + c7538z.f30174b);
        C3244B.m17190a();
        addView(imageButton, new FrameLayout.LayoutParams(iM33276c4, C7590g.m33276c(context, c7538z.f30176d + c7538z.f30175c), 17));
        long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzbq)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        C7537y c7537y = ((Boolean) C3250D.m17200c().zzd(zzbci.zzbr)).booleanValue() ? new C7537y(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(c7537y);
    }

    /* JADX INFO: renamed from: c */
    private final void m33136c() {
        String str = (String) C3250D.m17200c().zzd(zzbci.zzbp);
        if (!AbstractC3760o.m18196d() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f30106a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZzf = C7351t.m32354l().zzf();
        if (resourcesZzf == null) {
            this.f30106a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZzf.getDrawable(AbstractC7155a.f28581b);
            } else if ("black".equals(str)) {
                drawable = resourcesZzf.getDrawable(AbstractC7155a.f28580a);
            }
        } catch (Resources.NotFoundException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.f30106a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.f30106a;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    /* JADX INFO: renamed from: a */
    public final void m33137a(boolean z7) {
        if (!z7) {
            this.f30106a.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.f30106a;
        imageButton.setVisibility(8);
        if (((Long) C3250D.m17200c().zzd(zzbci.zzbq)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ImageButton m33138b() {
        return this.f30106a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC7520h interfaceC7520h = this.f30107b;
        if (interfaceC7520h != null) {
            interfaceC7520h.zzd();
        }
    }
}
