import { CategoryService } from './category.service';
import { Component, inject, OnInit } from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { Category } from './category.model';

@Component({
  selector: 'app-category',
  standalone: true,
  imports: [
    FontAwesomeModule
  ],
  templateUrl: './category.component.html',
  styleUrl: './category.component.scss'
})
export class CategoryComponent implements OnInit {

  categoryService = inject(CategoryService);

  categories: Category[] | undefined;

  currentActivetedCategory = this.categoryService.getCategoryByDefault;


  ngOnInit(): void {
    this.fetchCategories();
  }

  fetchCategories() {
    this.categories = this.categoryService.getCategories();
  }

}
