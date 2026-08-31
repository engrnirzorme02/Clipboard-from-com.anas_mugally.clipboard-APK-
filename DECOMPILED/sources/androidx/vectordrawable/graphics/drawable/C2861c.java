package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.collection.C2390a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p025D.AbstractC0165h;
import p025D.AbstractC0168k;
import p041F.AbstractC0400a;

/* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c */
/* JADX INFO: loaded from: classes.dex */
public class C2861c extends AbstractC2864f implements Animatable {

    /* JADX INFO: renamed from: b */
    private c f11593b;

    /* JADX INFO: renamed from: c */
    private Context f11594c;

    /* JADX INFO: renamed from: d */
    private ArgbEvaluator f11595d;

    /* JADX INFO: renamed from: e */
    d f11596e;

    /* JADX INFO: renamed from: f */
    private Animator.AnimatorListener f11597f;

    /* JADX INFO: renamed from: r */
    ArrayList f11598r;

    /* JADX INFO: renamed from: s */
    final Drawable.Callback f11599s;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C2861c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            C2861c.this.scheduleSelf(runnable, j7);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C2861c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C2861c.this.f11598r);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2860b) arrayList.get(i7)).mo14226b(C2861c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C2861c.this.f11598r);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2860b) arrayList.get(i7)).mo14227c(C2861c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    private static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        int f11602a;

        /* JADX INFO: renamed from: b */
        C2865g f11603b;

        /* JADX INFO: renamed from: c */
        AnimatorSet f11604c;

        /* JADX INFO: renamed from: d */
        ArrayList f11605d;

        /* JADX INFO: renamed from: e */
        C2390a f11606e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f11602a = cVar.f11602a;
                C2865g c2865g = cVar.f11603b;
                if (c2865g != null) {
                    Drawable.ConstantState constantState = c2865g.getConstantState();
                    if (resources != null) {
                        this.f11603b = (C2865g) constantState.newDrawable(resources);
                    } else {
                        this.f11603b = (C2865g) constantState.newDrawable();
                    }
                    C2865g c2865g2 = (C2865g) this.f11603b.mutate();
                    this.f11603b = c2865g2;
                    c2865g2.setCallback(callback);
                    this.f11603b.setBounds(cVar.f11603b.getBounds());
                    this.f11603b.m14245g(false);
                }
                ArrayList arrayList = cVar.f11605d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11605d = new ArrayList(size);
                    this.f11606e = new C2390a(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        Animator animator = (Animator) cVar.f11605d.get(i7);
                        Animator animatorClone = animator.clone();
                        String str = (String) cVar.f11606e.get(animator);
                        animatorClone.setTarget(this.f11603b.m14244c(str));
                        this.f11605d.add(animatorClone);
                        this.f11606e.put(animatorClone, str);
                    }
                    m14235a();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m14235a() {
            if (this.f11604c == null) {
                this.f11604c = new AnimatorSet();
            }
            this.f11604c.playTogether(this.f11605d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11602a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C2861c() {
        this(null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static C2861c m14228a(Context context, int i7) {
        C2861c c2861c = new C2861c(context);
        Drawable drawableM813e = AbstractC0165h.m813e(context.getResources(), i7, context.getTheme());
        c2861c.f11608a = drawableM813e;
        drawableM813e.setCallback(c2861c.f11599s);
        c2861c.f11596e = new d(c2861c.f11608a.getConstantState());
        return c2861c;
    }

    /* JADX INFO: renamed from: c */
    private static void m14229c(AnimatedVectorDrawable animatedVectorDrawable, AbstractC2860b abstractC2860b) {
        animatedVectorDrawable.registerAnimationCallback(abstractC2860b.m14225a());
    }

    /* JADX INFO: renamed from: d */
    private void m14230d() {
        Animator.AnimatorListener animatorListener = this.f11597f;
        if (animatorListener != null) {
            this.f11593b.f11604c.removeListener(animatorListener);
            this.f11597f = null;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m14231e(String str, Animator animator) {
        animator.setTarget(this.f11593b.f11603b.m14244c(str));
        c cVar = this.f11593b;
        if (cVar.f11605d == null) {
            cVar.f11605d = new ArrayList();
            this.f11593b.f11606e = new C2390a();
        }
        this.f11593b.f11605d.add(animator);
        this.f11593b.f11606e.put(animator, str);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m14232g(AnimatedVectorDrawable animatedVectorDrawable, AbstractC2860b abstractC2860b) {
        return animatedVectorDrawable.unregisterAnimationCallback(abstractC2860b.m14225a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1695a(drawable, theme);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14233b(AbstractC2860b abstractC2860b) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            m14229c((AnimatedVectorDrawable) drawable, abstractC2860b);
            return;
        }
        if (abstractC2860b == null) {
            return;
        }
        if (this.f11598r == null) {
            this.f11598r = new ArrayList();
        }
        if (this.f11598r.contains(abstractC2860b)) {
            return;
        }
        this.f11598r.add(abstractC2860b);
        if (this.f11597f == null) {
            this.f11597f = new b();
        }
        this.f11593b.f11604c.addListener(this.f11597f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            return AbstractC0400a.m1696b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f11593b.f11603b.draw(canvas);
        if (this.f11593b.f11604c.isStarted()) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m14234f(AbstractC2860b abstractC2860b) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            m14232g((AnimatedVectorDrawable) drawable, abstractC2860b);
        }
        ArrayList arrayList = this.f11598r;
        if (arrayList == null || abstractC2860b == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(abstractC2860b);
        if (this.f11598r.size() == 0) {
            m14230d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f11608a;
        return drawable != null ? AbstractC0400a.m1698d(drawable) : this.f11593b.f11603b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11593b.f11602a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11608a;
        return drawable != null ? AbstractC0400a.m1699e(drawable) : this.f11593b.f11603b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f11608a != null) {
            return new d(this.f11608a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f11593b.f11603b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f11593b.f11603b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.getOpacity() : this.f11593b.f11603b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1701g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM852q = AbstractC0168k.m852q(resources, theme, attributeSet, AbstractC2859a.f11583e);
                    int resourceId = typedArrayM852q.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2865g c2865gM14239b = C2865g.m14239b(resources, resourceId, theme);
                        c2865gM14239b.m14245g(false);
                        c2865gM14239b.setCallback(this.f11599s);
                        C2865g c2865g = this.f11593b.f11603b;
                        if (c2865g != null) {
                            c2865g.setCallback(null);
                        }
                        this.f11593b.f11603b = c2865gM14239b;
                    }
                    typedArrayM852q.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC2859a.f11584f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11594c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m14231e(string, AbstractC2863e.m14237a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f11593b.m14235a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f11608a;
        return drawable != null ? AbstractC0400a.m1702h(drawable) : this.f11593b.f11603b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f11608a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f11593b.f11604c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.isStateful() : this.f11593b.f11603b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11593b.f11603b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.setLevel(i7) : this.f11593b.f11603b.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11608a;
        return drawable != null ? drawable.setState(iArr) : this.f11593b.f11603b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f11593b.f11603b.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1704j(drawable, z7);
        } else {
            this.f11593b.f11603b.setAutoMirrored(z7);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2864f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1708n(drawable, i7);
        } else {
            this.f11593b.f11603b.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1709o(drawable, colorStateList);
        } else {
            this.f11593b.f11603b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            AbstractC0400a.m1710p(drawable, mode);
        } else {
            this.f11593b.f11603b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f11593b.f11603b.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f11593b.f11604c.isStarted()) {
                return;
            }
            this.f11593b.f11604c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11593b.f11604c.end();
        }
    }

    private C2861c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11608a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11593b.f11603b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$d */
    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        private final Drawable.ConstantState f11607a;

        public d(Drawable.ConstantState constantState) {
            this.f11607a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f11607a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11607a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2861c c2861c = new C2861c();
            Drawable drawableNewDrawable = this.f11607a.newDrawable();
            c2861c.f11608a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c2861c.f11599s);
            return c2861c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2861c c2861c = new C2861c();
            Drawable drawableNewDrawable = this.f11607a.newDrawable(resources);
            c2861c.f11608a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c2861c.f11599s);
            return c2861c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2861c c2861c = new C2861c();
            Drawable drawableNewDrawable = this.f11607a.newDrawable(resources, theme);
            c2861c.f11608a = drawableNewDrawable;
            drawableNewDrawable.setCallback(c2861c.f11599s);
            return c2861c;
        }
    }

    private C2861c(Context context, c cVar, Resources resources) {
        this.f11595d = null;
        this.f11597f = null;
        this.f11598r = null;
        a aVar = new a();
        this.f11599s = aVar;
        this.f11594c = context;
        if (cVar != null) {
            this.f11593b = cVar;
        } else {
            this.f11593b = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
