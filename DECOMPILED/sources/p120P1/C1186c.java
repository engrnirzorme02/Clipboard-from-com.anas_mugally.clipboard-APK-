package p120P1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import java.nio.ByteBuffer;
import java.util.List;
import p011B1.InterfaceC0055a;
import p019C1.InterfaceC0136l;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: P1.c */
/* JADX INFO: loaded from: classes.dex */
public class C1186c extends Drawable implements C1190g.b, Animatable {

    /* JADX INFO: renamed from: a */
    private final a f4229a;

    /* JADX INFO: renamed from: b */
    private boolean f4230b;

    /* JADX INFO: renamed from: c */
    private boolean f4231c;

    /* JADX INFO: renamed from: d */
    private boolean f4232d;

    /* JADX INFO: renamed from: e */
    private boolean f4233e;

    /* JADX INFO: renamed from: f */
    private int f4234f;

    /* JADX INFO: renamed from: r */
    private int f4235r;

    /* JADX INFO: renamed from: s */
    private boolean f4236s;

    /* JADX INFO: renamed from: t */
    private Paint f4237t;

    /* JADX INFO: renamed from: u */
    private Rect f4238u;

    /* JADX INFO: renamed from: v */
    private List f4239v;

    /* JADX INFO: renamed from: P1.c$a */
    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        final C1190g f4240a;

        a(C1190g c1190g) {
            this.f4240a = c1190g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1186c(this);
        }
    }

    public C1186c(Context context, InterfaceC0055a interfaceC0055a, InterfaceC0136l interfaceC0136l, int i7, int i8, Bitmap bitmap) {
        this(new a(new C1190g(ComponentCallbacks2C3202b.m16988c(context), interfaceC0055a, i7, i8, interfaceC0136l, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private Drawable.Callback m5207b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* JADX INFO: renamed from: d */
    private Rect m5208d() {
        if (this.f4238u == null) {
            this.f4238u = new Rect();
        }
        return this.f4238u;
    }

    /* JADX INFO: renamed from: h */
    private Paint m5209h() {
        if (this.f4237t == null) {
            this.f4237t = new Paint(2);
        }
        return this.f4237t;
    }

    /* JADX INFO: renamed from: j */
    private void m5210j() {
        List list = this.f4239v;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2860b) this.f4239v.get(i7)).mo14226b(this);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m5211l() {
        this.f4234f = 0;
    }

    /* JADX INFO: renamed from: n */
    private void m5212n() {
        AbstractC2022k.m8405b(!this.f4232d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4229a.f4240a.m5234f() == 1) {
            invalidateSelf();
        } else {
            if (this.f4230b) {
                return;
            }
            this.f4230b = true;
            this.f4229a.f4240a.m5240r(this);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m5213o() {
        this.f4230b = false;
        this.f4229a.f4240a.m5241s(this);
    }

    @Override // p120P1.C1190g.b
    /* JADX INFO: renamed from: a */
    public void mo5214a() {
        if (m5207b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m5218g() == m5217f() - 1) {
            this.f4234f++;
        }
        int i7 = this.f4235r;
        if (i7 == -1 || this.f4234f < i7) {
            return;
        }
        stop();
        m5210j();
    }

    /* JADX INFO: renamed from: c */
    public ByteBuffer m5215c() {
        return this.f4229a.f4240a.m5230b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4232d) {
            return;
        }
        if (this.f4236s) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m5208d());
            this.f4236s = false;
        }
        canvas.drawBitmap(this.f4229a.f4240a.m5231c(), (Rect) null, m5208d(), m5209h());
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m5216e() {
        return this.f4229a.f4240a.m5233e();
    }

    /* JADX INFO: renamed from: f */
    public int m5217f() {
        return this.f4229a.f4240a.m5234f();
    }

    /* JADX INFO: renamed from: g */
    public int m5218g() {
        return this.f4229a.f4240a.m5232d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4229a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4229a.f4240a.m5235h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4229a.f4240a.m5237k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: i */
    public int m5219i() {
        return this.f4229a.f4240a.m5236j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4230b;
    }

    /* JADX INFO: renamed from: k */
    public void m5220k() {
        this.f4232d = true;
        this.f4229a.f4240a.m5229a();
    }

    /* JADX INFO: renamed from: m */
    public void m5221m(InterfaceC0136l interfaceC0136l, Bitmap bitmap) {
        this.f4229a.f4240a.m5239o(interfaceC0136l, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4236s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        m5209h().setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m5209h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        AbstractC2022k.m8405b(!this.f4232d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4233e = z7;
        if (!z7) {
            m5213o();
        } else if (this.f4231c) {
            m5212n();
        }
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4231c = true;
        m5211l();
        if (this.f4233e) {
            m5212n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4231c = false;
        m5213o();
    }

    C1186c(a aVar) {
        this.f4233e = true;
        this.f4235r = -1;
        this.f4229a = (a) AbstractC2022k.m8408e(aVar);
    }
}
