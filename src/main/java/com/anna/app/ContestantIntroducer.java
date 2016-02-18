package com.anna.app;

import org.aspectj.lang.annotation.*;

@Aspect
public class ContestantIntroducer {
	@DeclareParents(
			value = "ua.com.glybovets.di.Performer+",
			defaultImpl = GraciousContestant.class)
			public static Contestant contestant;
}
