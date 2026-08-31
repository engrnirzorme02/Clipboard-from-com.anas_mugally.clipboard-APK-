package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p111O.ViewTreeObserverOnPreDrawListenerC0999J;
import p248g0.AbstractC5451a;
import p248g0.AbstractC5452b;

/* JADX INFO: renamed from: androidx.fragment.app.k */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2593k {
    /* JADX INFO: renamed from: a */
    private static int m12246a(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7, boolean z8) {
        if (z8) {
            return z7 ? abstractComponentCallbacksC2591i.m12137M() : abstractComponentCallbacksC2591i.m12140N();
        }
        return z7 ? abstractComponentCallbacksC2591i.m12207w() : abstractComponentCallbacksC2591i.m12215z();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    /* JADX INFO: renamed from: b */
    static a m12247b(Context context, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7, boolean z8) {
        Animator animatorLoadAnimator;
        int iM12126I = abstractComponentCallbacksC2591i.m12126I();
        int iM12246a = m12246a(abstractComponentCallbacksC2591i, z7, z8);
        abstractComponentCallbacksC2591i.m12115D1(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC2591i.f10137S;
        if (viewGroup != null) {
            int i7 = AbstractC5452b.f20752c;
            if (viewGroup.getTag(i7) != null) {
                abstractComponentCallbacksC2591i.f10137S.setTag(i7, null);
            }
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC2591i.f10137S;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationM12208w0 = abstractComponentCallbacksC2591i.m12208w0(iM12126I, z7, iM12246a);
        if (animationM12208w0 != null) {
            return new a(animationM12208w0);
        }
        Animator animatorM12210x0 = abstractComponentCallbacksC2591i.m12210x0(iM12126I, z7, iM12246a);
        if (animatorM12210x0 != null) {
            return new a(animatorM12210x0);
        }
        if (iM12246a == 0 && iM12126I != 0) {
            iM12246a = m12249d(context, iM12126I, z7);
        }
        if (iM12246a != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM12246a));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM12246a);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM12246a);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e8) {
                        if (zEquals) {
                            throw e8;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM12246a);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM12246a);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static int m12248c(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: d */
    private static int m12249d(Context context, int i7, boolean z7) {
        if (i7 == 4097) {
            return z7 ? AbstractC5451a.f20748e : AbstractC5451a.f20749f;
        }
        if (i7 == 8194) {
            return z7 ? AbstractC5451a.f20744a : AbstractC5451a.f20745b;
        }
        if (i7 == 8197) {
            return z7 ? m12248c(context, R.attr.activityCloseEnterAnimation) : m12248c(context, R.attr.activityCloseExitAnimation);
        }
        if (i7 == 4099) {
            return z7 ? AbstractC5451a.f20746c : AbstractC5451a.f20747d;
        }
        if (i7 != 4100) {
            return -1;
        }
        return z7 ? m12248c(context, R.attr.activityOpenEnterAnimation) : m12248c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.k$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public final Animation f10216a;

        /* JADX INFO: renamed from: b */
        public final Animator f10217b;

        a(Animation animation) {
            this.f10216a = animation;
            this.f10217b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f10216a = null;
            this.f10217b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.k$b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a */
        private final ViewGroup f10218a;

        /* JADX INFO: renamed from: b */
        private final View f10219b;

        /* JADX INFO: renamed from: c */
        private boolean f10220c;

        /* JADX INFO: renamed from: d */
        private boolean f10221d;

        /* JADX INFO: renamed from: e */
        private boolean f10222e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f10222e = true;
            this.f10218a = viewGroup;
            this.f10219b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f10222e = true;
            if (this.f10220c) {
                return !this.f10221d;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f10220c = true;
                ViewTreeObserverOnPreDrawListenerC0999J.m4375a(this.f10218a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10220c || !this.f10222e) {
                this.f10218a.endViewTransition(this.f10219b);
                this.f10221d = true;
            } else {
                this.f10222e = false;
                this.f10218a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f10222e = true;
            if (this.f10220c) {
                return !this.f10221d;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f10220c = true;
                ViewTreeObserverOnPreDrawListenerC0999J.m4375a(this.f10218a, this);
            }
            return true;
        }
    }
}
