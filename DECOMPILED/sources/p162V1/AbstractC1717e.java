package p162V1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p169W1.InterfaceC1822b;

/* JADX INFO: renamed from: V1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1717e extends AbstractC1721i implements InterfaceC1822b.a {

    /* JADX INFO: renamed from: s */
    private Animatable f5709s;

    public AbstractC1717e(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: renamed from: o */
    private void m7319o(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f5709s = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f5709s = animatable;
        animatable.start();
    }

    /* JADX INFO: renamed from: r */
    private void m7320r(Object obj) {
        mo7312q(obj);
        m7319o(obj);
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: a */
    public void mo5654a() {
        Animatable animatable = this.f5709s;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: c */
    public void mo5242c(Object obj, InterfaceC1822b interfaceC1822b) {
        if (interfaceC1822b == null || !interfaceC1822b.mo7573a(obj, this)) {
            m7320r(obj);
        } else {
            m7319o(obj);
        }
    }

    @Override // p162V1.AbstractC1713a, p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: d */
    public void mo7310d(Drawable drawable) {
        super.mo7310d(drawable);
        m7320r(null);
        m7321p(drawable);
    }

    @Override // p134R1.InterfaceC1319l
    /* JADX INFO: renamed from: e */
    public void mo5655e() {
        Animatable animatable = this.f5709s;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p162V1.AbstractC1721i, p162V1.AbstractC1713a, p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: g */
    public void mo7311g(Drawable drawable) {
        super.mo7311g(drawable);
        m7320r(null);
        m7321p(drawable);
    }

    @Override // p162V1.AbstractC1721i, p162V1.AbstractC1713a, p162V1.InterfaceC1720h
    /* JADX INFO: renamed from: i */
    public void mo5243i(Drawable drawable) {
        super.mo5243i(drawable);
        Animatable animatable = this.f5709s;
        if (animatable != null) {
            animatable.stop();
        }
        m7320r(null);
        m7321p(drawable);
    }

    /* JADX INFO: renamed from: p */
    public void m7321p(Drawable drawable) {
        ((ImageView) this.f5712a).setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: q */
    protected abstract void mo7312q(Object obj);
}
